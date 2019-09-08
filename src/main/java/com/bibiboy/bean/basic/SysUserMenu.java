package com.bibiboy.bean.basic;

import java.util.List;

public class SysUserMenu {
	
	private String nUserId;
	
	private List<SysMeun> menuList;

	public String getnUserId() {
		return nUserId;
	}

	public void setnUserId(String nUserId) {
		this.nUserId = nUserId;
	}

	public List<SysMeun> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<SysMeun> menuList) {
		this.menuList = menuList;
	}
	
}
