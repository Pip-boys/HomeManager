package com.bibiboy.bean.order;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CodeInfo extends CodeInfoKey {
	private Integer nId;
	
    private String vcName;

    private String vcTypeName;

    public Integer getnId() {
		return nId;
	}

	public void setnId(Integer nId) {
		this.nId = nId;
	}

	private String vcCompanyName;

    private String vcTel;

    private String vcItem;

    private String vcModel;
    
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date dtReg;

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName == null ? null : vcName.trim();
    }

    public String getVcTypeName() {
        return vcTypeName;
    }

    public void setVcTypeName(String vcTypeName) {
        this.vcTypeName = vcTypeName == null ? null : vcTypeName.trim();
    }

    public String getVcCompanyName() {
        return vcCompanyName;
    }

    public void setVcCompanyName(String vcCompanyName) {
        this.vcCompanyName = vcCompanyName == null ? null : vcCompanyName.trim();
    }

    public String getVcTel() {
        return vcTel;
    }

    public void setVcTel(String vcTel) {
        this.vcTel = vcTel == null ? null : vcTel.trim();
    }

    public String getVcItem() {
        return vcItem;
    }

    public void setVcItem(String vcItem) {
        this.vcItem = vcItem == null ? null : vcItem.trim();
    }

    public String getVcModel() {
        return vcModel;
    }

    public void setVcModel(String vcModel) {
        this.vcModel = vcModel == null ? null : vcModel.trim();
    }

    public Date getDtReg() {
        return dtReg;
    }

    public void setDtReg(Date dtReg) {
        this.dtReg = dtReg;
    }

	public void clear() {
		this.setVcCode(null);
		this.setnUserId(null);
		this.nId = null;
		this.vcTypeName = null;
		this.vcTel = null;
		this.vcItem = null;
		this.vcModel = null;
		this.dtReg = null;
    }
}