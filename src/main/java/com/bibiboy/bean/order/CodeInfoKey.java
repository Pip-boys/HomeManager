package com.bibiboy.bean.order;

public class CodeInfoKey {
    private String vcCode;

    private Integer nUserId;

    public String getVcCode() {
        return vcCode;
    }

    public void setVcCode(String vcCode) {
        this.vcCode = vcCode == null ? null : vcCode.trim();
    }

    public Integer getnUserId() {
        return nUserId;
    }

    public void setnUserId(Integer nUserId) {
        this.nUserId = nUserId;
    }
}