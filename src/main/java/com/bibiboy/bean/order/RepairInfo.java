package com.bibiboy.bean.order;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RepairInfo {
    private Integer nId;

    private Integer nUserId;

    private Integer nRepairerId;

    private Integer nEquipId;

    private Integer nStatus;

    private String vcType;

    private String vcReason;
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date dtReg;
    
    private String vcContent;
    
    private String vcName;
    
    private String vcTel;
    
    private String equipName;
    
    private String vcModel;
    
    private String vcPlace;
      
    public String getVcPlace() {
		return vcPlace;
	}

	public void setVcPlace(String vcPlace) {
		this.vcPlace = vcPlace;
	}

	public String getEquipName() {
		return equipName;
	}

	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}

	public String getVcModel() {
		return vcModel;
	}

	public void setVcModel(String vcModel) {
		this.vcModel = vcModel;
	}

	public String getVcName() {
		return vcName;
	}

	public void setVcName(String vcName) {
		this.vcName = vcName;
	}

	public String getVcTel() {
		return vcTel;
	}

	public void setVcTel(String vcTel) {
		this.vcTel = vcTel;
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

    public Integer getnRepairerId() {
        return nRepairerId;
    }

    public void setnRepairerId(Integer nRepairerId) {
        this.nRepairerId = nRepairerId;
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

    public String getVcType() {
        return vcType;
    }

    public void setVcType(String vcType) {
        this.vcType = vcType == null ? null : vcType.trim();
    }

    public String getVcReason() {
        return vcReason;
    }

    public void setVcReason(String vcReason) {
        this.vcReason = vcReason == null ? null : vcReason.trim();
    }

    public Date getDtReg() {
        return dtReg;
    }

    public void setDtReg(Date dtReg) {
        this.dtReg = dtReg;
    }

    public String getVcContent() {
        return vcContent;
    }

    public void setVcContent(String vcContent) {
        this.vcContent = vcContent == null ? null : vcContent.trim();
    }
}