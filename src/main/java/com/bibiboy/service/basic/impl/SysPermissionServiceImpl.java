package com.bibiboy.service.basic.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bibiboy.bean.basic.SysPermission;
import com.bibiboy.bean.basic.SysPermissionExample;
import com.bibiboy.bean.basic.SysPermissionExample.Criteria;
import com.bibiboy.bean.basic.SysRole;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.mapper.basic.SysPermissionMapper;
import com.bibiboy.service.basic.ISysPermission;

@Service
public class SysPermissionServiceImpl implements ISysPermission{
	
	@Autowired
	private SysPermissionMapper sysPermissionMapper;
	
	@Override
	public PageResult findList(SysRole sysRole) {
		SysPermissionExample sysPermissionExample = new SysPermissionExample();
		Criteria permissionCriteria = sysPermissionExample.createCriteria();
		permissionCriteria.andNRoleIdEqualTo(sysRole.getnId());
		List<SysPermission> permissionList = sysPermissionMapper.selectByExample(sysPermissionExample);
		return new PageResult(permissionList.size(), permissionList);
	}

	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
	public BaseResult updateSysUser(List<SysPermission> permissionList) throws Exception {
		if (permissionList.size()<=0) {
			return new BaseResult(400, "缺少权限参数,请至少选择一项！");
		}
		Integer nRoleId = permissionList.get(0).getnRoleId();
		SysPermissionExample sysPermissionExample = new SysPermissionExample();
		Criteria criteria = sysPermissionExample.createCriteria();
		criteria.andNRoleIdEqualTo(nRoleId);
		sysPermissionMapper.deleteByExample(sysPermissionExample);
		
		for (SysPermission sysPermission : permissionList) {
			sysPermission.permissionListToString();
		}
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("permissionList", permissionList);
		map.put("nRoleId", nRoleId);
		sysPermissionMapper.insertSysPermissionBatch(map);
		return new BaseResult("更新成功");
	}

	@Override
	public BaseResult deleteSysPermissionByRoleId(Integer nRoleId)throws Exception {
		SysPermissionExample sysPermissionExample = new SysPermissionExample();
		Criteria createCriteria = sysPermissionExample.createCriteria();
		createCriteria.andNRoleIdEqualTo(nRoleId);
		sysPermissionMapper.deleteByExample(sysPermissionExample);
		return new BaseResult("删除成功");
	}

}
