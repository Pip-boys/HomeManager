package com.bibiboy.service.generator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.bibiboy.bean.basic.MyUser;
import com.bibiboy.bean.basic.SysRole;
import com.bibiboy.bean.basic.SysUser;
import com.bibiboy.bean.entity.ThreadLocalContext;
import com.bibiboy.mapper.basic.SysRoleMapper;
import com.bibiboy.mapper.basic.SysUserMapper;

/*
 * User服务类，主要对User进行数据处理，比如角色、(权限?)等，在loadUserByUsername方法中处理数据后赋予给User返回
 */
@Component
public class MyUserDetailsService implements UserDetailsService{

    Logger logger = LoggerFactory.getLogger(MyUserDetailsService.class);
    
    @Autowired
    private SysUserMapper sysUserMapper;
    
    @Autowired
    private SysRoleMapper sysRoleMapper;
    
    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	Collection<GrantedAuthority> authorities = null;
    	Map<String, Object> map=null;
    	SysUser sysUser=null;
    	List<SysRole> userRoleList=null;
    	
    	//这样写法还是有很大的问题的，问题在于，角色权限的变更和数据库同步问题，可以通过初次登录时初始化用户在redis中的角色菜单和权限菜单
    	Optional<Map<String, Object>> optional= Optional.ofNullable((Map<String, Object>)redisTemplate.opsForHash().get(username, username));	
        if (optional.isPresent()) {
        	//redis路线，获取数据，同时把权限移除
        	map = optional.get();
        	sysUser = (SysUser) map.get("sysUser");
        	if (map.containsKey("permissionList")) {
				map.remove("permissionList");
			}
		}else {
			//查询数据库，放到redis中
			map = new HashMap<>();
			sysUser = sysUserMapper.getOnebyUserName(username);
	    	if(sysUser == null) 
	            throw new UsernameNotFoundException("用户名不存在");
	    	if (sysUser.getnStatus()==0) {
	    		throw new DisabledException("用户已被封禁");
			}
	    	map.put("sysUser", sysUser);
	        map.put("userRoleList", userRoleList);
		}
        
        // 添加角色,先临时写成角色赋予...?
    	userRoleList = sysRoleMapper.getRoleListByUserId(sysUser.getnId());
    	map.put("userRoleList", userRoleList);
    	
        
        ThreadLocalContext.setInfomation(sysUser.getnId());
        authorities=new ArrayList<>();
        for (SysRole role : userRoleList) {
            authorities.add(new SimpleGrantedAuthority(role.getVcSecurityName()));
        }  
        redisTemplate.opsForHash().put(username, username, map);
        return new User(sysUser.getVcUserName(), sysUser.getVcPassWord(), true, true, true, true, authorities);
    }
    
    //之前将所有用户存进一个map中进行操作，不过发现操作过于麻烦就放弃了。
    //Optional<Map<String, Object>> optional = Optional.ofNullable((Map<String,Map>)redisTemplate.opsForHash().get("userInfoMap", "userInfoMap")).map(c->(Map<String, Object>)c.get(username));
	/*Map<String, Map<String,Object>> userInfoMap = (Map<String, Map<String, Object>>) redisTemplate.opsForHash().get("userInfoMap", "userInfoMap");
	userInfoMap=userInfoMap==null?userInfoMap:new HashMap<String,Map<String, Object>>();
	
	Optional<SysUser> result = Optional.ofNullable(userInfoMap.get(username)).map(c->(SysUser)c.get("sysUser"));
	if (!result.isPresent()) {
		Map<String,Object> m=new HashMap<>();
		m.put("sysUser", sysUser);
		userInfoMap.put(username, m);
	}*/

}

