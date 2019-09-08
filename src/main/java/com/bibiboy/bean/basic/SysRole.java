package com.bibiboy.bean.basic;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class SysRole {
	@NotNull(message="nId不能为空")
    private Integer nId;

    private String vcName;

    private String vcSecurityName;

    private Integer nSort;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName == null ? null : vcName.trim();
    }

    public String getVcSecurityName() {
        return vcSecurityName;
    }

    public void setVcSecurityName(String vcSecurityName) {
        this.vcSecurityName = vcSecurityName == null ? null : vcSecurityName.trim();
    }

    public Integer getnSort() {
        return nSort;
    }

    public void setnSort(Integer nSort) {
        this.nSort = nSort;
    }
}