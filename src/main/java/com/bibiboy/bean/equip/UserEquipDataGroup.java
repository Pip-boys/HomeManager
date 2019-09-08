package com.bibiboy.bean.equip;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class UserEquipDataGroup {
	private Integer nId;
    private String vcCode;
    private String vcModel;
    private String vcItem;
    private String vcName;
    private String vcPic;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dtReg;
    private List<EquipData> equipDataList;
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
	public String getVcName() {
		return vcName;
	}
	public void setVcName(String vcName) {
		this.vcName = vcName;
	}
	public String getVcPic() {
		return vcPic;
	}
	public void setVcPic(String vcPic) {
		this.vcPic = vcPic;
	}
	public Date getDtReg() {
		return dtReg;
	}
	public void setDtReg(Date dtReg) {
		this.dtReg = dtReg;
	}
	public List<EquipData> getEquipDataList() {
		return equipDataList;
	}
	public void setEquipDataList(List<EquipData> equipDataList) {
		this.equipDataList = equipDataList;
	}
    
}
