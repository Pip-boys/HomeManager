package com.bibiboy.service.basic;

import com.bibiboy.bean.basic.SysRole;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;

public interface ISysRoleService {
	
	/**
	 * 查找角色列表
	 * <p>Title: findList</p>  
	 * <p>Description: </p>  
	 * @param sysRole
	 * @param pageReceive
	 * @return
	 * @throws Exception
	 */
	PageResult findList(SysRole sysRole, PageReceive pageReceive);
	
	/**
	 * 增加角色
	 * <p>Title: addSysRole</p>  
	 * <p>Description: </p>  
	 * @param sysRole
	 * @return
	 * @throws Exception
	 */
	BaseResult addSysRole(SysRole sysRole)throws Exception;
	
	/**
	 * 更新角色
	 * <p>Title: updateSysRole</p>  
	 * <p>Description: </p>  
	 * @return
	 * @throws Exception
	 */
	BaseResult updateSysRole(SysRole sysRole)throws Exception;
	
	/**
	 * 删除角色
	 * <p>Title: deleteSysRole</p>  
	 * <p>Description: </p>  
	 * @param nId
	 * @return
	 * @throws Exception
	 */
	BaseResult deleteSysRole(Integer nId)throws Exception;
}
