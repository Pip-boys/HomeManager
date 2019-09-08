package com.bibiboy.bean.basic;

import javax.validation.constraints.NotBlank;

public class SysMeun {
    private Integer nId;

    private Integer nPid;

    private Integer nLevel;
    
    @NotBlank()
    private String vcName;
    
    @NotBlank()
    private String vcUrl;

    private String vcMemo;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public Integer getnPid() {
        return nPid;
    }

    public void setnPid(Integer nPid) {
        this.nPid = nPid;
    }

    public Integer getnLevel() {
        return nLevel;
    }

    public void setnLevel(Integer nLevel) {
        this.nLevel = nLevel;
    }

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName == null ? null : vcName.trim();
    }

    public String getVcUrl() {
        return vcUrl;
    }

    public void setVcUrl(String vcUrl) {
        this.vcUrl = vcUrl == null ? null : vcUrl.trim();
    }

    public String getVcMemo() {
        return vcMemo;
    }

    public void setVcMemo(String vcMemo) {
        this.vcMemo = vcMemo == null ? null : vcMemo.trim();
    }
}