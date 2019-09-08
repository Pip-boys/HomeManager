package com.bibiboy.controller.basic;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bibiboy.bean.basic.SysPermission;
import com.bibiboy.bean.basic.SysRole;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.service.basic.ISysPermission;

@RestController
@RequestMapping(value="/sysPermission")
public class SysPermissionController {
	
	@Autowired
	private ISysPermission sysPermissionService;
	
	@RequestMapping(value="/sysPermission",method = { RequestMethod.GET })
	public PageResult findList(@Valid SysRole sysRole) {
		return sysPermissionService.findList(sysRole);
	}
	
	@RequestMapping(value="/sysPermission",consumes = {"application/json;charset=UTF-8"},method = { RequestMethod.POST})
	BaseResult updateSysUser(@RequestBody @Valid List<SysPermission> permissionList)throws Exception{
		return sysPermissionService.updateSysUser(permissionList);
	}
}
