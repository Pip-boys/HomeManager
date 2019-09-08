package com.bibiboy.bean.entity;

import javax.validation.constraints.NotNull;

public class PageReceive {
	
	@NotNull
	private Integer pageNum;
    /**
     * 页面大小
     */
	@NotNull
    private Integer pageSize;
    /**
     * 起始行
     */
    private Integer startRow;
    /**
     * 末行
     */
    private Integer endRow;
    /**
     * 总数
     */
    private Long total;
    /**
     * 总页数
     */
    private Integer pages;
	public Integer getPageNum() {
		return pageNum;
	}
	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	public Integer getEndRow() {
		return endRow;
	}
	public void setEndRow(Integer endRow) {
		this.endRow = endRow;
	}
	public Long getTotal() {
		return total;
	}
	public void setTotal(Long total) {
		this.total = total;
	}
	public Integer getPages() {
		return pages;
	}
	public void setPages(Integer pages) {
		this.pages = pages;
	}
    
    
}
