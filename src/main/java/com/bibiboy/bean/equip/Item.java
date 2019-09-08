package com.bibiboy.bean.equip;

public class Item {
	
	private String vcItemName;
	private String value;
	public String getVcItemName() {
		return vcItemName;
	}
	public void setVcItemName(String vcItemName) {
		this.vcItemName = vcItemName;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Item(String vcItemName, String value) {
		super();
		this.vcItemName = vcItemName;
		this.value = value;
	}
	public Item() {
		super();
	}
	
}
