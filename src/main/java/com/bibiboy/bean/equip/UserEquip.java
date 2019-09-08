package com.bibiboy.bean.equip;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class UserEquip {
    private Integer nId;

    private Integer nUserId;

    private Integer nEquipDetailId;

    private Boolean nStatus;

    private String vcCode;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dtReg;
    
    public Boolean getnStatus() {
		return nStatus;
	}

	public void setnStatus(Boolean nStatus) {
		this.nStatus = nStatus;
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

    public Integer getnEquipDetailId() {
        return nEquipDetailId;
    }

    public void setnEquipDetailId(Integer nEquipDetailId) {
        this.nEquipDetailId = nEquipDetailId;
    }

    public String getVcCode() {
        return vcCode;
    }

    public void setVcCode(String vcCode) {
        this.vcCode = vcCode == null ? null : vcCode.trim();
    }

    public Date getDtReg() {
        return dtReg;
    }

    public void setDtReg(Date dtReg) {
        this.dtReg = dtReg;
    }
}