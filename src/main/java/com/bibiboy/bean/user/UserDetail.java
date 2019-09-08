package com.bibiboy.bean.user;

import java.util.Date;

import javax.validation.constraints.NotBlank;

import org.springframework.format.annotation.DateTimeFormat;

public class UserDetail {
	
    private Integer nId;

    private String vcUserName;

    private Integer nIntegral;

    private String vcSex;

    private String vcHomeName;

    private String vcName;

    private String vcSign;

    private String vcIdentification;

    private String vcPlace;

    private String vcPic;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dtBirth;
    
    private Integer nManagerFlag;
    
    private Integer nSellerFlag;
    
    private Integer nRepairFlag;
    
    private Integer nType;
    
    

    public Integer getnType() {
		return nType;
	}

	public void setnType(Integer nType) {
		this.nType = nType;
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

	public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getVcUserName() {
        return vcUserName;
    }

    public void setVcUserName(String vcUserName) {
        this.vcUserName = vcUserName == null ? null : vcUserName.trim();
    }

    public Integer getnIntegral() {
        return nIntegral;
    }

    public void setnIntegral(Integer nIntegral) {
        this.nIntegral = nIntegral;
    }

    public String getVcSex() {
        return vcSex;
    }

    public void setVcSex(String vcSex) {
        this.vcSex = vcSex == null ? null : vcSex.trim();
    }

    public String getVcHomeName() {
        return vcHomeName;
    }

    public void setVcHomeName(String vcHomeName) {
        this.vcHomeName = vcHomeName == null ? null : vcHomeName.trim();
    }

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName == null ? null : vcName.trim();
    }

    public String getVcSign() {
        return vcSign;
    }

    public void setVcSign(String vcSign) {
        this.vcSign = vcSign == null ? null : vcSign.trim();
    }

    public String getVcIdentification() {
        return vcIdentification;
    }

    public void setVcIdentification(String vcIdentification) {
        this.vcIdentification = vcIdentification == null ? null : vcIdentification.trim();
    }

    public String getVcPlace() {
        return vcPlace;
    }

    public void setVcPlace(String vcPlace) {
        this.vcPlace = vcPlace == null ? null : vcPlace.trim();
    }

    public String getVcPic() {
        return vcPic;
    }

    public void setVcPic(String vcPic) {
        this.vcPic = vcPic == null ? null : vcPic.trim();
    }

    public Date getDtBirth() {
        return dtBirth;
    }

    public void setDtBirth(Date dtBirth) {
        this.dtBirth = dtBirth;
    }
    public UserDetail() {
		super();
	}

	public UserDetail(String vcUserName) {
		super();
		this.vcUserName = vcUserName;
	}
}