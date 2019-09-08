package com.bibiboy.bean.equip;

import java.math.BigDecimal;

public class EquipDetail {
    private Integer nId;

    private Integer nPid;

    private Integer nType;

    private String vcName;

    private String vcModel;

    private String vcItem;

    private String vcPic;

    private BigDecimal dPrice;
    
    private String vcCode;
    
    private Integer equipDetailId;
    
    private Integer nStatus;

	public Integer getnStatus() {
		return nStatus;
	}

	public void setnStatus(Integer nStatus) {
		this.nStatus = nStatus;
	}

	public Integer getEquipDetailId() {
		return equipDetailId;
	}

	public void setEquipDetailId(Integer equipDetailId) {
		this.equipDetailId = equipDetailId;
	}

	public String getVcCode() {
		return vcCode;
	}

	public void setVcCode(String vcCode) {
		this.vcCode = vcCode;
	}

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

    public Integer getnType() {
        return nType;
    }

    public void setnType(Integer nType) {
        this.nType = nType;
    }

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName == null ? null : vcName.trim();
    }

    public String getVcModel() {
        return vcModel;
    }

    public void setVcModel(String vcModel) {
        this.vcModel = vcModel == null ? null : vcModel.trim();
    }

    public String getVcItem() {
        return vcItem;
    }

    public void setVcItem(String vcItem) {
        this.vcItem = vcItem == null ? null : vcItem.trim();
    }

    public String getVcPic() {
        return vcPic;
    }

    public void setVcPic(String vcPic) {
        this.vcPic = vcPic == null ? null : vcPic.trim();
    }

    public BigDecimal getdPrice() {
        return dPrice;
    }

    public void setdPrice(BigDecimal dPrice) {
        this.dPrice = dPrice;
    }
}