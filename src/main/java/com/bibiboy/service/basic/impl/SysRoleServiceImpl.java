package com.bibiboy.service.basic.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bibiboy.bean.basic.SysRole;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.mapper.basic.SysRoleMapper;
import com.bibiboy.service.basic.ISysPermission;
import com.bibiboy.service.basic.ISysRoleService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class SysRoleServiceImpl implements ISysRoleService{

	@Autowired
	private SysRoleMapper sysRoleMapper;
	
	@Autowired
	private ISysPermission sysPermissionService;
	
	@Override
	public PageResult findList(SysRole sysRole, PageReceive pageReceive){
		if (pageReceive.getPageNum()!=null&&pageReceive.getPageSize()!=null) {
			PageHelper.startPage(pageReceive.getPageNum()+1, pageReceive.getPageSize());
			Page<SysRole> page = (Page<SysRole>) sysRoleMapper.findList(sysRole);
			long total = page.getTotal();
			List<SysRole> result = page.getResult();
			return new PageResult(total, result);
		}else {
			List<SysRole> result=sysRoleMapper.findList(sysRole);
			return new PageResult(result.size(), result);
		}
		
	}

	@Override
	public BaseResult addSysRole(SysRole sysRole) throws Exception {
		sysRoleMapper.insertSelective(sysRole);
		return new BaseResult("新增成功");
	}

	@Override
	public BaseResult updateSysRole(SysRole sysRole) throws Exception {
		sysRoleMapper.updateByPrimaryKeySelective(sysRole);
		return new BaseResult("更新成功");
	}

	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
	public BaseResult deleteSysRole(Integer nId) throws Exception {
		sysRoleMapper.deleteByPrimaryKey(nId);
		sysRoleMapper.deleteUserRoleListByRoleId(nId);
		sysPermissionService.deleteSysPermissionByRoleId(nId);
		return new BaseResult("删除成功");
	}
	
}
