package com.bibiboy.mapper.basic;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bibiboy.bean.basic.SysUser;
import com.bibiboy.bean.basic.SysUserExample;

public interface SysUserMapper {
    int countByExample(SysUserExample example);

    int deleteByExample(SysUserExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExampleWithBLOBs(SysUserExample example);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExampleWithBLOBs(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByExample(@Param("record") SysUser record, @Param("example") SysUserExample example);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKeyWithBLOBs(SysUser record);

    int updateByPrimaryKey(SysUser record);
    
    @Select(value="select su.vc_User_Name from sys_user su where su.n_Id=#{nId}")
    String getOnebyUserNameNid(Integer nId);
    
    @Select(value="select su.* from sys_user su where su.vc_User_Name=#{vcUserName}")
    SysUser getOnebyUserName(String vcUserName);
    
    List<SysUser> findSysUserList(@Param("sysUser") SysUser sysUser);
    
    int clearSysUserFlag(@Param("sysUser") SysUser sysUser);
}