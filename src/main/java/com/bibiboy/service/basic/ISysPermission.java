package com.bibiboy.service.basic;

import java.util.List;

import com.bibiboy.bean.basic.SysPermission;
import com.bibiboy.bean.basic.SysRole;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageResult;

public interface ISysPermission {
	
	/**
	 * 查找某个角色的权限列表
	 * <p>Title: findList</p>  
	 * <p>Description: </p>  
	 * @param sysRole
	 * @return
	 */
	public PageResult findList(SysRole sysRole);
	
	/**
	 * 更新用户的权限列表
	 * <p>Title: updateSysUser</p>  
	 * <p>Description: </p>  
	 * @param sysRole
	 * @param listPermission
	 * @return
	 * @throws Exception
	 */
	BaseResult updateSysUser(List<SysPermission> listPermission)throws Exception;
	
	/**
	 * 删除某个角色的所有权限
	 * <p>Title: deleteSysUser</p>  
	 * <p>Description: </p>  
	 * @param nRoleId
	 * @return
	 */
	BaseResult deleteSysPermissionByRoleId(Integer nRoleId)throws Exception;
}
