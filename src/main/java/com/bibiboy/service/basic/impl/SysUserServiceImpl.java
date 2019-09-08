package com.bibiboy.service.basic.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bibiboy.bean.basic.SysUser;
import com.bibiboy.bean.basic.SysUserExample;
import com.bibiboy.bean.basic.SysUserExample.Criteria;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.bean.user.UserDetail;
import com.bibiboy.mapper.basic.SysMeunMapper;
import com.bibiboy.mapper.basic.SysRoleMapper;
import com.bibiboy.mapper.basic.SysUserMapper;
import com.bibiboy.mapper.user.UserDetailMapper;
import com.bibiboy.service.basic.ISysUserService;
import com.bibiboy.util.GeneralTool;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;


/*@RunWith(SpringRunner.class)
@SpringBootTest(classes = EducationApplication.class)
@Configuration*/
@Service
public class SysUserServiceImpl implements ISysUserService{
	
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Autowired
	private SysMeunMapper sysMeunMapper;
	
	@Autowired
	private SysRoleMapper sysRoleMapper;
	
	@Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    
    @Autowired
    private UserDetailMapper userDetailMapper;

	@Override
	public PageResult findList(SysUser sysUser,PageReceive pageReceive) {
		PageHelper.startPage(pageReceive.getPageNum()+1, pageReceive.getPageSize());
		Page<SysUser> page = (Page<SysUser>)sysUserMapper.findSysUserList(sysUser);
		long total = page.getTotal();
		List<SysUser> result = page.getResult();
		return new PageResult(total, result);
	}

	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
	public BaseResult addSysUser(SysUser sysUser)throws Exception {
		sysUser.setDtReg(new Date());
		sysUser.setDtUpdate(new Date());
		sysUser.getFlag();
		sysUser.setVcPassWord(GeneralTool.md5Encode(sysUser.getVcPassWord()));
		
		//sysUserMapper.clearSysUserFlag(sysUser);
		sysUserMapper.insertSelective(sysUser);
		sysMeunMapper.insertInitUserMenu(sysUser.getnId());
		
		UserDetail userDetail = new UserDetail();
		userDetail.setVcUserName(sysUser.getVcUserName());
		userDetail.setVcPic("images/default/head.jpg");
		userDetail.setVcName("匿名用户");
		userDetail.setnIntegral(0);
		userDetail.setnId(sysUser.getnId());
		
		userDetailMapper.insertSelective(userDetail);
		
		
		
		
		return new BaseResult("添加用户成功！");
	}
	
	@Override
	public BaseResult updateSysUser(SysUser sysUser) throws Exception {
		sysUser.setDtUpdate(new Date());
		sysUser.getFlag();
		sysUserMapper.updateByPrimaryKeySelective(sysUser);
		
		String vcUserName = sysUser.getVcUserName();
		Optional<Map<String, Object>> optional= Optional.ofNullable((Map<String, Object>)redisTemplate.opsForHash().get(vcUserName, vcUserName));	
		if (optional.isPresent()) {
			redisTemplate.opsForHash().delete(vcUserName, vcUserName);
		}
		
		return new BaseResult("更新用户成功！");
	}

	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
	public BaseResult delSysUser(Integer nId)throws Exception {
		sysUserMapper.deleteByPrimaryKey(nId);
		sysMeunMapper.deleteUserMenuListByUserId(nId);
		sysRoleMapper.deleteUserRoleListByUserId(nId);
		userDetailMapper.deleteByPrimaryKey(nId);
		
		String vcUserName = sysUserMapper.getOnebyUserNameNid(nId);
		
		/*Optional<Map<String, Object>> optional= Optional.ofNullable((Map<String, Object>)redisTemplate.opsForHash().get(vcUserName, vcUserName));	
		if (optional.isPresent()) {
			redisTemplate.opsForHash().delete(vcUserName, vcUserName);
		}*/
		return new BaseResult("删除用户成功！");
	}

	@Override
	public SysUser getSysUserByRedis() throws Exception{
		String username= SecurityContextHolder.getContext().getAuthentication().getName();
		Optional<SysUser> optional = Optional.ofNullable((Map<String, Object>)redisTemplate.opsForHash().get(username, username)).map(c->(SysUser)c.get("sysUser"));
		if (!optional.isPresent()) {
			throw new RuntimeException("数据缺失,请重新登陆");
		}
		SysUser sysUser = optional.get();
		return sysUser;
	}

	@Override
	@Transactional
	public BaseResult updateSysUserType(SysUser sysUser) throws Exception {
		SysUser s = getSysUserByRedis();
		if (sysUser.getnType()==0) {
			sysMeunMapper.deleteUserMenuListByUserId(s.getnId());
			sysMeunMapper.insertInitUserMenu(s.getnId());
		}else if(sysUser.getnType()==3) {
			sysMeunMapper.deleteUserMenuListByUserId(s.getnId());
			sysMeunMapper.insertInitUserManagerMenu(s.getnId());
		}
		sysUserMapper.updateByPrimaryKeySelective(sysUser);
		return new BaseResult("ok");
	}
	
	/*@Test
	public void test() {
		//redis中所有user的集合
		Map<String, Map<String, Object>> userInfoMap = new HashMap<>();
		
		//redis中的user集合中的一个user
		Map<String, Object> liri = new HashMap<>();
		//该user中的SysUser对象
		SysUser sysUser = new SysUser();
		sysUser.setVcName("丽日御茶子");
		//该user的权限列表
		List<SysPermission> permissionList = new ArrayList<>();
		SysPermission sysPermission = new SysPermission();
		sysPermission.setVcPermission("a,d,s,u");
		permissionList.add(sysPermission);
		
		liri.put("sysUser", sysUser);
		liri.put("permissionList", permissionList);
		
		userInfoMap.put("liri", liri);
		//redisTemplate.opsForHash().put("userInfoMap","userInfoMap", userInfoMap);
		Optional<SysUser> optional = Optional.ofNullable((Map<String, Object>)redisTemplate.opsForHash().get("userInfoMap", "userInfoMap")).map(c->(Map)c.get("liri")).map(c->(SysUser)c.get("sysUser"));

		SysUser sysUser2 = optional.get();
		
		
		System.out.println("1");
	}*/
	
	/*@Test
	public void test() {
		PageHelper.startPage(2, 2);		
		Page<SysUser> page=   (Page<SysUser>) sysUserMapper.selectByExample(null);
		long total = page.getTotal();
		List<SysUser> result = page.getResult();
	}*/
	
	/*@Test
	public void test() {
		SysUser sysUser = new SysUser();
		sysUser.setVcName("小明");
		System.out.println("测试");
		redisTemplate.opsForHash().put("user","user", "放进去值了");
		Object object = redisTemplate.opsForHash().get("user", "user");
		redisTemplate.opsForHash().put("user", "user", sysUser);
		Object object2 = redisTemplate.opsForHash().get("user", "user");
		
		Map<String, Object> map = new HashMap<>();
		map.put("user", sysUser);
		stringRedisTemplate.opsForHash().put("user", "user", JSON.toJSONString(sysUser));
		Object object3 = stringRedisTemplate.opsForHash().get("user", "user");
		JSONObject parseObject = JSON.parseObject(object3.toString());
		Object object4 = parseObject.get("vcName");
	}*/

}
