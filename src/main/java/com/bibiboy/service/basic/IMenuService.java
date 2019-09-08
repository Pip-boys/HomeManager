package com.bibiboy.service.basic;

import java.util.List;

import com.bibiboy.bean.basic.SysMeun;
import com.bibiboy.bean.basic.SysUser;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;

public interface IMenuService {
	
	/**
	 * 查找当前登录人的菜单，并携带这个用户的详细用户信息
	 * <p>Title: findList</p>  
	 * <p>Description: </p>  
	 * @param sysMeun
	 * @param pageReceive
	 * @return
	 * @throws Exception
	 */
	PageResult findLoginUserMenuList()throws Exception;
	
	/**
	 * 寻找某个用户的菜单
	 * <p>Title: findMenuByUser</p>  
	 * <p>Description: </p>  
	 * @param vcUserName
	 * @return
	 * @throws Exception
	 */
	public BaseResult findMenuByUserIdAndAllList(Integer nUserId)throws Exception;
	
	/**
	 * 查找菜单列表
	 * <p>Title: findList</p>  
	 * <p>Description: </p>  
	 * @return
	 */
	PageResult findList(PageReceive pageReceive);
	
	/**
	 * 新增菜单
	 * <p>Title: addMenu</p>  
	 * <p>Description: </p>  
	 * @param sysMeun
	 * @return
	 * @throws Exception
	 */
	public BaseResult addMenu(SysMeun sysMeun)throws Exception;
	
	/**
	 * 更新菜单
	 * <p>Title: updateMenu</p>  
	 * <p>Description: </p>  
	 * @return
	 * @throws Exception
	 */
	public BaseResult updateMenu(SysMeun sysMeun)throws Exception;
	
	/**
	 * 更新用户-菜单
	 * <p>Title: updateUserMenu</p>  
	 * <p>Description: </p>  
	 * @param menuList
	 * @param sysUser
	 * @return
	 * @throws Exception
	 */
	public BaseResult updateUserMenu(List<SysMeun> menuList, String nUserId)throws Exception;
	
	/**
	 * 删除菜单
	 * <p>Title: deleteMenu</p>  
	 * <p>Description: </p>  
	 * @return
	 * @throws Exception
	 */
	public BaseResult deleteMenu(Integer nId)throws Exception;
	
}
