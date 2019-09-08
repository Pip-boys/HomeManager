package com.bibiboy.bean.entity;

/**
 * 如果用Commonmapper查询信息可以用这个
* <p>Title: Pager</p>  
* @author 哔哔小子
* @date 2019年1月22日
 */
public class Pager {
	private int page;
	private int rows;
	private String tableName;
	private String fields;
	private String sqlWhere;
	private String orderBy;
	private String groupBy;
	private String primaryKey;
	
	private String sort;
	private String order;
	private int totalCount;
	private int pageCount;
	public int getFirstPage() {
		return 1;
	}

	public int getPreviousPage() {
		if (this.page <= 1) {
			return 1;
		}

		return this.page - 1;
	}

	public int getNextPage() {
		if (this.page >= getLastPage()) {
			return getLastPage();
		}

		return this.page + 1;
	}

	public int getLastPage() {
		int last = (this.totalCount + this.rows - 1) / this.rows;
		return last;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public int getPage() {
		return page;
	}
	public String getSort() {
		return sort;
	}
	public void setSort(String sort) {
		this.sort = sort;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public String getTableName() {
		return tableName;
	}
	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	public String getFields() {
		return fields;
	}
	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getSqlWhere() {
		return sqlWhere;
	}
	public void setSqlWhere(String sqlWhere) {
		this.sqlWhere = sqlWhere;
	}
	
	public String getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(String primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public String getGroupBy() {
		return groupBy;
	}

	public void setGroupBy(String groupBy) {
		this.groupBy = groupBy;
	}
	
}
