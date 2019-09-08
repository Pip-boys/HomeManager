package com.bibiboy.mapper.basic;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface CommonMapper {
	
	/**
	 * 根据sql语句构成List
	 */
	List<Map<String, Object>> mapSql(@Param("sql") String sql);
	
	/**
	 * 根据sql语句构成map
	 */
	Map<String, Object> mapSql_(@Param("sql") String sql);	
	
	/**
	 * 根据sql语句返回integer
	 */
	int intSql(@Param("sql") String sql);
	
	/**
	 * 根据sql删除语句返回integer
	 */
	int delSql(@Param("sql") String sql);
	/**
	 * 根据sql更新语句返回integer
	 */
	int updateSql(@Param("sql") String sql);
	
}
