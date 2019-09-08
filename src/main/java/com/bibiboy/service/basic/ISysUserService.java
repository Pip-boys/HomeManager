package com.bibiboy.service.basic;

import com.bibiboy.bean.basic.SysUser;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;

public interface ISysUserService {
	/**
	 * 查询系统用户列表
	 * <p>Title: findList</p>  
	 * <p>Description: </p>  
	 * @return
	 */
	public PageResult findList(SysUser sysUser, PageReceive pageReceive);
	
	/**
	 * 新增系统用户
	 * <p>Title: addSysUser</p>  
	 * <p>Description: </p>  
	 * @param sysUser
	 * @return
	 * @throws Exception
	 */
	BaseResult addSysUser(SysUser sysUser)throws Exception;
	
	/**
	 * 更新系统用户
	 * <p>Title: updateSysUser</p>  
	 * <p>Description: </p>  
	 * @param sysUser
	 * @return
	 * @throws Exception
	 */
	BaseResult updateSysUser(SysUser sysUser)throws Exception;
	
	/**
	 * 删除系统用户
	 * <p>Title: delSysUser</p>  
	 * <p>Description: </p>  
	 * @param nId
	 * @return
	 * @throws Exception
	 */
	BaseResult delSysUser(Integer nId)throws Exception;
	
	/**
	 * 通过redis中的数据获取用户的信息
	 * <p>Title: getSysUserByRedis</p>  
	 * <p>Description: </p>  
	 * @return
	 * @throws Exception
	 */
	SysUser getSysUserByRedis() throws Exception;
	
	/**
	 * 更新用户的身份状态
	 * <p>Title: updateSysUserFlag</p>  
	 * <p>Description: </p>  
	 * @param sysUser
	 * @return
	 * @throws Exception
	 */
	BaseResult updateSysUserType(SysUser sysUser)throws Exception;
}
