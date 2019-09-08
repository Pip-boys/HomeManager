package com.bibiboy.bean.basic;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class SysUser {
    private Integer nType;

    private Integer nId;

    private Integer nStatus;

    private String vcUserName;

    private String vcPassWord;

    private String vcName;

    private String vcTel;

    private String vcEmail;

    private Integer nManagerFlag;

    private Integer nSellerFlag;

    private Integer nRepairFlag;
    
    private String n_Role_Id;
    
    private List<String> flagList;
    
	public Integer getnType() {
		return nType;
	}

	public void setnType(Integer nType) {
		this.nType = nType;
	}

	@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dtReg;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dtUpdate;

    private String vcMemo;
    
    public void getFlag() {
    	this.nManagerFlag=0;
    	this.nSellerFlag=0;
    	this.nRepairFlag=0;
    	for (String string : this.flagList) {
			switch (string) {
			case "nManagerFlag":
				this.nManagerFlag=1;
				break;
			case "nSellerFlag":
				this.nSellerFlag=1;
				break;
			case "nRepairFlag":
				this.nRepairFlag=1;
				break;
			default:
				break;
			}
    	}
    }

	public String getN_Role_Id() {
		return n_Role_Id;
	}

	public void setN_Role_Id(String n_Role_Id) {
		this.n_Role_Id = n_Role_Id;
	}

	public List<String> getFlagList() {
		return flagList;
	}

	public void setFlagList(List<String> flagList) {
		this.flagList = flagList;
	}

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public Integer getnStatus() {
        return nStatus;
    }

    public void setnStatus(Integer nStatus) {
        this.nStatus = nStatus;
    }

    public String getVcUserName() {
        return vcUserName;
    }

    public void setVcUserName(String vcUserName) {
        this.vcUserName = vcUserName == null ? null : vcUserName.trim();
    }

    public String getVcPassWord() {
        return vcPassWord;
    }

    public void setVcPassWord(String vcPassWord) {
        this.vcPassWord = vcPassWord == null ? null : vcPassWord.trim();
    }

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName == null ? null : vcName.trim();
    }

    public String getVcTel() {
        return vcTel;
    }

    public void setVcTel(String vcTel) {
        this.vcTel = vcTel == null ? null : vcTel.trim();
    }

    public String getVcEmail() {
        return vcEmail;
    }

    public void setVcEmail(String vcEmail) {
        this.vcEmail = vcEmail == null ? null : vcEmail.trim();
    }

    public Integer getnManagerFlag() {
        return nManagerFlag;
    }

    public void setnManagerFlag(Integer nManagerFlag) {
        this.nManagerFlag = nManagerFlag;
    }

    public Integer getnSellerFlag() {
        return nSellerFlag;
    }

    public void setnSellerFlag(Integer nSellerFlag) {
        this.nSellerFlag = nSellerFlag;
    }

    public Integer getnRepairFlag() {
        return nRepairFlag;
    }

    public void setnRepairFlag(Integer nRepairFlag) {
        this.nRepairFlag = nRepairFlag;
    }

    public Date getDtReg() {
        return dtReg;
    }

    public void setDtReg(Date dtReg) {
        this.dtReg = dtReg;
    }

    public Date getDtUpdate() {
        return dtUpdate;
    }

    public void setDtUpdate(Date dtUpdate) {
        this.dtUpdate = dtUpdate;
    }

    public String getVcMemo() {
        return vcMemo;
    }

    public void setVcMemo(String vcMemo) {
        this.vcMemo = vcMemo == null ? null : vcMemo.trim();
    }
}