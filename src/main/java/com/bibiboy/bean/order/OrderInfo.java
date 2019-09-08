package com.bibiboy.bean.order;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class OrderInfo {
    
	private String vcCode;

	private Integer nId;

    private Integer nUserId;

    private Integer nEquipId;

    private Integer nStatus;

    private String vcPlace;

    private BigDecimal dPrice;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dtOrder;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dtUpdate;

    private String vcName;
    
    private String vcModel;
    
    private String vcPic;

	public String getVcCode() {
		return vcCode;
	}

	public void setVcCode(String vcCode) {
		this.vcCode = vcCode;
	}

	public Integer getnId() {
		return nId;
	}

	public void setnId(Integer nId) {
		this.nId = nId;
	}

	public Integer getnUserId() {
		return nUserId;
	}

	public void setnUserId(Integer nUserId) {
		this.nUserId = nUserId;
	}

	public Integer getnEquipId() {
		return nEquipId;
	}

	public void setnEquipId(Integer nEquipId) {
		this.nEquipId = nEquipId;
	}

	public Integer getnStatus() {
		return nStatus;
	}

	public void setnStatus(Integer nStatus) {
		this.nStatus = nStatus;
	}

	public String getVcPlace() {
		return vcPlace;
	}

	public void setVcPlace(String vcPlace) {
		this.vcPlace = vcPlace;
	}

	public BigDecimal getdPrice() {
		return dPrice;
	}

	public void setdPrice(BigDecimal dPrice) {
		this.dPrice = dPrice;
	}

	public Date getDtOrder() {
		return dtOrder;
	}

	public void setDtOrder(Date dtOrder) {
		this.dtOrder = dtOrder;
	}

	public Date getDtUpdate() {
		return dtUpdate;
	}

	public void setDtUpdate(Date dtUpdate) {
		this.dtUpdate = dtUpdate;
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

	public String getVcPic() {
		return vcPic;
	}

	public void setVcPic(String vcPic) {
		this.vcPic = vcPic;
	}
    
}