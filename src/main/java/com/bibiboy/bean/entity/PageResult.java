package com.bibiboy.bean.entity;

import java.io.Serializable;
import java.util.List;
/**
 * 分页结果类
 * @author Administrator
 *
 */
public class PageResult implements Serializable{

	private long total;//总记录数
	private List rows;//当前页记录
	private Object otherDate;//可能的额外数据
	
	

	public PageResult(long total, List rows) {
		super();
		this.total = total;
		this.rows = rows;
	}
	public PageResult() {
		super();
	}
	public PageResult(long total, List rows, Object otherDate) {
		super();
		this.total = total;
		this.rows = rows;
		this.otherDate = otherDate;
	}
	public Object getOtherDate() {
		return otherDate;
	}
	public void setOtherDate(Object otherDate) {
		this.otherDate = otherDate;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	
}
