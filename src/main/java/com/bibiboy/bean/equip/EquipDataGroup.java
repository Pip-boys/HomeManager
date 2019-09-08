package com.bibiboy.bean.equip;

import java.util.List;

public class EquipDataGroup {
    
    private Integer nPid;
    
    List<EquipData> equipDataList;
    
	public List<EquipData> getEquipDataList() {
		return equipDataList;
	}

	public void setEquipDataList(List<EquipData> equipDataList) {
		this.equipDataList = equipDataList;
	}

	public Integer getnPid() {
		return nPid;
	}

	public void setnPid(Integer nPid) {
		this.nPid = nPid;
	}
    
    
}