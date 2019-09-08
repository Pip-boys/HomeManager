package com.bibiboy.bean.user;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class CompanyInfo {
    private Integer nId;

    private Integer nVip;

    private String vcName;

    private String vcPic;

    private String vcTel;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date dtReg;

    private String vcDesc;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public Integer getnVip() {
        return nVip;
    }

    public void setnVip(Integer nVip) {
        this.nVip = nVip;
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

    public String getVcTel() {
        return vcTel;
    }

    public void setVcTel(String vcTel) {
        this.vcTel = vcTel == null ? null : vcTel.trim();
    }

    public Date getDtReg() {
        return dtReg;
    }

    public void setDtReg(Date dtReg) {
        this.dtReg = dtReg;
    }

    public String getVcDesc() {
        return vcDesc;
    }

    public void setVcDesc(String vcDesc) {
        this.vcDesc = vcDesc == null ? null : vcDesc.trim();
    }
}