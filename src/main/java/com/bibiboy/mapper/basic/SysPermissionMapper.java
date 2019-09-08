package com.bibiboy.mapper.basic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.bibiboy.bean.basic.SysPermission;
import com.bibiboy.bean.basic.SysPermissionExample;

public interface SysPermissionMapper {
    int countByExample(SysPermissionExample example);

    int deleteByExample(SysPermissionExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    List<SysPermission> selectByExample(SysPermissionExample example);

    SysPermission selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByExample(@Param("record") SysPermission record, @Param("example") SysPermissionExample example);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
    
    int insertSysPermissionBatch(Map<String, Object> map);
    
}