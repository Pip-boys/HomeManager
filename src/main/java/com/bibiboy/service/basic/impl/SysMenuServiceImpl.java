package com.bibiboy.service.basic.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.bibiboy.bean.basic.SysMeun;
import com.bibiboy.bean.basic.SysMeunExample;
import com.bibiboy.bean.basic.SysMeunExample.Criteria;
import com.bibiboy.bean.basic.SysUser;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.bean.user.UserDetail;
import com.bibiboy.mapper.basic.SysMeunMapper;
import com.bibiboy.mapper.user.UserDetailMapper;
import com.bibiboy.service.basic.IMenuService;
import com.bibiboy.util.GeneralParameter;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class SysMenuServiceImpl implements IMenuService{
	
	@Autowired
	private SysMeunMapper sysMeunMapper;
	
	@Autowired
	private UserDetailMapper userDetailMapper;
	
	@Override
	public PageResult findLoginUserMenuList() throws Exception {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		User user = (User) authentication.getPrincipal();
		
		Page<SysMeun> pageResult = sysMeunMapper.findMenuListByUserName(user.getUsername());
		
		UserDetail userDetailTemp = new UserDetail();
		userDetailTemp.setVcUserName(user.getUsername());
		UserDetail userDetail = userDetailMapper.getUserDetail(userDetailTemp);
		userDetail.setVcPic(GeneralParameter.NGINXHOST+userDetail.getVcPic());
		
		return new PageResult(pageResult.getTotal(), pageResult.getResult(), userDetail);
	}

	@Override
	public BaseResult findMenuByUserIdAndAllList(Integer nUserId) throws Exception {
		List<SysMeun> menuList = sysMeunMapper.findMenuListByUserId(nUserId);
		List<SysMeun> menuListInit = sysMeunMapper.selectByExample(null);
		HashMap<String, List<SysMeun>> menuMap = new HashMap<>();
		menuMap.put("menuList", menuList);
		menuMap.put("menuListInit", menuListInit);
		return new BaseResult(menuMap);
	}
	@Override
	public PageResult findList(PageReceive pageReceive) {	
		PageHelper.startPage(pageReceive.getPageNum()+1, pageReceive.getPageSize());
		Page<SysMeun> page = (Page<SysMeun>)sysMeunMapper.selectByExample(null);
		long total = page.getTotal();
		List<SysMeun> result = page.getResult();
		return new PageResult(total, result);
	}

	@Override
	public BaseResult addMenu(SysMeun sysMeun) throws Exception {
		sysMeunMapper.insertSelective(sysMeun);
		return new BaseResult("新增成功");
	}

	@Override
	public BaseResult updateMenu(SysMeun sysMeun) throws Exception {
		sysMeunMapper.updateByPrimaryKeySelective(sysMeun);
		return new BaseResult("更新成功");
	}
	
	@Override
	public BaseResult updateUserMenu(List<SysMeun> menuList, String nUserId) throws Exception {
		HashMap<String, Object> map = new HashMap<>();
		map.put("nUserId", nUserId);
		map.put("menuList", menuList);
		sysMeunMapper.deleteUserMenuListByUserId(Integer.parseInt(nUserId));
		sysMeunMapper.insertSysUserMenuBatch(map);
		return new BaseResult("更新成功");
	}


	@Override
	@Transactional(isolation=Isolation.DEFAULT,propagation=Propagation.REQUIRED,readOnly=false)
	public BaseResult deleteMenu(Integer nId) throws Exception {
		sysMeunMapper.deleteByPrimaryKey(nId);
		sysMeunMapper.deleteUserMenuListByMenuId(nId);
		return new BaseResult("删除成功");
	}

	

}
