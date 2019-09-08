package com.bibiboy.controller.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bibiboy.bean.basic.SysRole;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.service.basic.ISysRoleService;

@RestController
@RequestMapping(value="/sysRole")
public class SysRoleController {
	
	@Autowired
	private ISysRoleService sysRoleService;
	
	@RequestMapping(value="/sysRole",method = { RequestMethod.GET })
	PageResult findList(SysRole sysRole,PageReceive pageReceive){
		return sysRoleService.findList(sysRole, pageReceive);
	}
	
	@RequestMapping(value="/sysRole",method = { RequestMethod.PUT })
	BaseResult addSysRole(@RequestBody SysRole sysRole) throws Exception{
		return sysRoleService.addSysRole(sysRole);
	}
	
	@RequestMapping(value="/sysRole",method = { RequestMethod.POST })
	BaseResult updateSysRole(@RequestBody SysRole sysRole) throws Exception{
		return sysRoleService.updateSysRole(sysRole);
	}
	
	@RequestMapping(value="/sysRole/{nId}",method = { RequestMethod.DELETE })
	BaseResult deleteSysRole(@PathVariable("nId") Integer nId)throws Exception{
		return sysRoleService.deleteSysRole(nId);
	}
}
