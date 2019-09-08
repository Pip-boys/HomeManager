package com.bibiboy.bean.equip;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class EquipDate {
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dtCre;

	public Date getDtCre() {
		return dtCre;
	}

	public void setDtCre(Date dtCre) {
		this.dtCre = dtCre;
	}

	
	
}
