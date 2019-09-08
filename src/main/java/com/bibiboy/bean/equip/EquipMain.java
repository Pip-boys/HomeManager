package com.bibiboy.bean.equip;

import java.util.Date;

public class EquipMain {
    private Integer nId;

    private Integer nType;

    private Integer nCompany;

    private String vcName;

    private String vcPic;

    private Date dtReg;

    private Date dtUpdate;

    private String vcIntroduce;
    
    private String companyName;
    

    public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public Integer getnType() {
        return nType;
    }

    public void setnType(Integer nType) {
        this.nType = nType;
    }

    public Integer getnCompany() {
        return nCompany;
    }

    public void setnCompany(Integer nCompany) {
        this.nCompany = nCompany;
    }

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName == null ? null : vcName.trim();
    }

    public String getVcPic() {
        return vcPic;
    }

    public void setVcPic(String vcPic) {
        this.vcPic = vcPic == null ? null : vcPic.trim();
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

    public String getVcIntroduce() {
        return vcIntroduce;
    }

    public void setVcIntroduce(String vcIntroduce) {
        this.vcIntroduce = vcIntroduce == null ? null : vcIntroduce.trim();
    }
}