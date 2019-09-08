package com.bibiboy.controller.basic;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bibiboy.bean.basic.SysMeun;
import com.bibiboy.bean.basic.SysUser;
import com.bibiboy.bean.basic.SysUserMenu;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.service.basic.IMenuService;

@RestController
@RequestMapping(value="/sysMenu")
public class SysMenuController {
	
	@Autowired
	private IMenuService menuService;
	
	@RequestMapping(value="/sysMenu/{nId}",method = { RequestMethod.GET })
	public BaseResult findMenuByUserId(@PathVariable("nId") Integer nId)throws Exception {
		return menuService.findMenuByUserIdAndAllList(nId);
	}
	
	@RequestMapping(value="/sysMenu",produces = {"application/json;charset=UTF-8"},method = { RequestMethod.GET })
	public PageResult findLoginUserMenuList()throws Exception {
		return menuService.findLoginUserMenuList();
	}
	
	@RequestMapping(value="/sysMenus",produces = {"application/json;charset=UTF-8"},method = { RequestMethod.GET })
	public PageResult findList(PageReceive pageReceive)throws Exception {
		return menuService.findList(pageReceive);
	}
	
	@RequestMapping(value="/sysMenu",consumes = {"application/json;charset=UTF-8"},method = { RequestMethod.PUT })
	public BaseResult addMenu(@RequestBody @Valid SysMeun sysMeun)throws Exception {
		return menuService.addMenu(sysMeun);
	}
	
	@RequestMapping(value="/sysMenu",consumes = {"application/json;charset=UTF-8"},method = { RequestMethod.POST })
	public BaseResult updateMenu(@RequestBody @Valid SysMeun sysMeun)throws Exception {
		return menuService.updateMenu(sysMeun);
	}
	
	@RequestMapping(value="/sysUserMenu",consumes = {"application/json;charset=UTF-8"},method = { RequestMethod.POST })
	public BaseResult updateUserMenu(@RequestBody @Valid SysUserMenu sysUserMenu)throws Exception {
		List<SysMeun> menuList = sysUserMenu.getMenuList();
		String nUserId = sysUserMenu.getnUserId();
		return menuService.updateUserMenu(menuList, nUserId);
	}
	
	@RequestMapping(value="/sysMenu/{nId}",method = { RequestMethod.DELETE })
	public BaseResult deleteMenu(@PathVariable("nId") Integer nId)throws Exception {
		return menuService.deleteMenu(nId);
	}
}
