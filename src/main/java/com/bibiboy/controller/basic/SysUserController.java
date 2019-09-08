package com.bibiboy.controller.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bibiboy.bean.basic.SysUser;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.service.basic.ISysUserService;

/*@CrossOrigin(origins = "http://127.0.0.0:80", maxAge = 3600)*/
@RestController
@RequestMapping(value="/sysUser")
public class SysUserController {
	
	@Autowired
	private ISysUserService sysUserService;
	
	@RequestMapping(value="/sysUser",consumes = {"application/json;charset=UTF-8"},method = { RequestMethod.GET })
	//@CrossOrigin
	 @PreAuthorize("hasRole('ROLE_ADMIN')")
	public PageResult findList(SysUser sysUser,PageReceive pageReceive) {
		return sysUserService.findList(sysUser, pageReceive);
	}
	
	@RequestMapping(value="/sysUser",consumes = {"application/json;charset=UTF-8"},method = { RequestMethod.PUT })
	BaseResult addSysUser(@RequestBody SysUser sysUser) throws Exception {
		return sysUserService.addSysUser(sysUser);
	}
	
	@RequestMapping(value="/sysUser",consumes = {"application/json;charset=UTF-8"},method = { RequestMethod.POST })
	BaseResult updateSysUser(@RequestBody SysUser sysUser) throws Exception {
		return sysUserService.updateSysUser(sysUser);
	}
	
	@RequestMapping(value="/sysUser/{nId}",method = { RequestMethod.DELETE })
	BaseResult delSysUser(@PathVariable("nId") Integer nId) throws Exception {
		return sysUserService.delSysUser(nId);
	}
	
	@RequestMapping(value="/type",consumes = {"application/json;charset=UTF-8"},method = { RequestMethod.POST })
	public BaseResult updateSysUserType(@RequestBody SysUser sysUser) throws Exception{
		return sysUserService.updateSysUserType(sysUser);
	}
}
