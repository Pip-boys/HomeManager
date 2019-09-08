package com.bibiboy.bean.equip;

public class EquipDataType {
    private Integer nId;

    private Integer nType;

    private String vcUnit;

    private String vcDataName;
    
    private Integer nTypeId;
    
    public Integer getnTypeId() {
		return nTypeId;
	}

	public void setnTypeId(Integer nTypeId) {
		this.nTypeId = nTypeId;
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

    public String getVcUnit() {
        return vcUnit;
    }

    public void setVcUnit(String vcUnit) {
        this.vcUnit = vcUnit == null ? null : vcUnit.trim();
    }

    public String getVcDataName() {
        return vcDataName;
    }

    public void setVcDataName(String vcDataName) {
        this.vcDataName = vcDataName == null ? null : vcDataName.trim();
    }
}