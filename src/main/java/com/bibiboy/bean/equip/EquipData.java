package com.bibiboy.bean.equip;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class EquipData {
    private Integer nShow;
    
    private Integer nId;

    private String vcCode;

    private String vcDataName;

    private String vcData;
    
    private String vcName;
    
    private String vcModel;
    
    private String vcItem;
    
    private String vcPic;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date dtCre;
    
    private Integer nPid;
    
	public Integer getnPid() {
		return nPid;
	}

	public void setnPid(Integer nPid) {
		this.nPid = nPid;
	}

	public Integer getnShow() {
		return nShow;
	}

	public void setnShow(Integer nShow) {
		this.nShow = nShow;
	}

	public Integer getnId() {
		return nId;
	}

	public void setnId(Integer nId) {
		this.nId = nId;
	}

	public String getVcCode() {
		return vcCode;
	}

	public void setVcCode(String vcCode) {
		this.vcCode = vcCode;
	}

	public String getVcDataName() {
		return vcDataName;
	}

	public void setVcDataName(String vcDataName) {
		this.vcDataName = vcDataName;
	}

	public String getVcData() {
		return vcData;
	}

	public void setVcData(String vcData) {
		this.vcData = vcData;
	}

	public String getVcName() {
		return vcName;
	}

	public void setVcName(String vcName) {
		this.vcName = vcName;
	}

	public String getVcModel() {
		return vcModel;
	}

	public void setVcModel(String vcModel) {
		this.vcModel = vcModel;
	}

	public String getVcItem() {
		return vcItem;
	}

	public void setVcItem(String vcItem) {
		this.vcItem = vcItem;
	}

	public String getVcPic() {
		return vcPic;
	}

	public void setVcPic(String vcPic) {
		this.vcPic = vcPic;
	}

	public Date getDtCre() {
		return dtCre;
	}

	public void setDtCre(Date dtCre) {
		this.dtCre = dtCre;
	}

	public EquipData() {
		super();
	}

	public EquipData(Integer nShow, String vcDataName, String vcData, Date dtCre, Integer nPid) {
		super();
		this.nShow = nShow;
		this.vcDataName = vcDataName;
		this.vcData = vcData;
		this.dtCre = dtCre;
		this.nPid = nPid;
	}
	
	
    
    
}