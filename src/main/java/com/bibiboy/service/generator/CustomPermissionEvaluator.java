package com.bibiboy.service.generator;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import com.bibiboy.bean.basic.SysPermission;
import com.bibiboy.bean.basic.SysPermissionExample;
import com.bibiboy.bean.basic.SysRole;
import com.bibiboy.bean.basic.SysRoleExample;
import com.bibiboy.bean.basic.SysRoleExample.Criteria;
import com.bibiboy.mapper.basic.SysPermissionMapper;
import com.bibiboy.mapper.basic.SysRoleMapper;


/**
 * 权限验证器，通过查询权限列表并比较来看是否有权
* <p>Title: CustomPermissionEvaluator</p>  
* @author 哔哔小子
* @date 2019年1月28日
 */
@Component
public class CustomPermissionEvaluator implements PermissionEvaluator {
	
	@Autowired
	private SysRoleMapper sysRoleMapper;
	
	@Autowired
	private SysPermissionMapper sysPermissionMapper;
	
	@Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;
	
    @Override
    public boolean hasPermission(Authentication authentication, Object targetUrl, Object targetPermission) {
    	List<SysPermission> permissionList=null;
        // 获得loadUserByUsername()方法的结果
        User user = (User) authentication.getPrincipal();  
        String username = user.getUsername();
        
        Object object = redisTemplate.opsForHash().get(username, username);
		Optional<List<SysPermission>> optional = Optional.ofNullable((Map<String, Object>)object).map(c->(List<SysPermission>)c.get("permissionList"));
        if (optional.isPresent()) {
        	permissionList=optional.get();
		}else {
			// 获得loadUserByUsername()中注入的角色
	        Collection<GrantedAuthority> authorities = user.getAuthorities();
			permissionList=getSysPermissionList(authorities,username);
			Map<String, Object> map=(Map<String, Object>) object; 
			map.put("permissionList", permissionList);
			redisTemplate.opsForHash().put(username, username, map);
		}
        
        // 遍历permissionList
        for(SysPermission sysPermission : permissionList) {
            // 获取权限集
            List permissions = sysPermission.getPermissions();
            // 如果访问的Url和权限用户符合的话，返回true
            if(targetUrl.equals(sysPermission.getVcUrl())
                    && permissions.contains(targetPermission)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable serializable, String s, Object o) {
        return false;
    }
    
    List<SysPermission> getSysPermissionList(Collection<GrantedAuthority> authorities,String username){
    	List<SysRole> userRoleList=null;
    	Optional<List<SysRole>> optional=Optional.ofNullable((Map<String, Object>)redisTemplate.opsForHash().get(username, username)).map(c->(List<SysRole>)c.get("userRoleList"));
        if (optional.isPresent()) {
        	userRoleList=optional.get();
        }else {
        	List<String> securityNameList = new ArrayList<>();
    		for (GrantedAuthority authority : authorities) {
    			securityNameList.add(authority.getAuthority());
    		}
    		SysRoleExample sysRoleExample = new SysRoleExample();
    		Criteria sysRoleCriteria = sysRoleExample.createCriteria();
    		sysRoleCriteria.andVcSecurityNameIn(securityNameList);
    		userRoleList = sysRoleMapper.selectByExample(sysRoleExample);
        }
    	
		List<Integer> roleIdList = new ArrayList<>();
		userRoleList.forEach(c->roleIdList.add(c.getnId()));
		
		SysPermissionExample sysPermissionExample = new SysPermissionExample();
		SysPermissionExample.Criteria permissionCriteria = sysPermissionExample.createCriteria();
		permissionCriteria.andNRoleIdIn(roleIdList);
		List<SysPermission> permissionList = sysPermissionMapper.selectByExample(sysPermissionExample);
		return permissionList;
   }
}
