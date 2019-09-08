package com.bibiboy.mapper.basic;

import com.bibiboy.bean.basic.SysRole;
import com.bibiboy.bean.basic.SysRoleExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SysRoleMapper {
    int countByExample(SysRoleExample example);

    int deleteByExample(SysRoleExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    List<SysRole> selectByExample(SysRoleExample example);

    SysRole selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByExample(@Param("record") SysRole record, @Param("example") SysRoleExample example);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
    
    @Select(value="select sr.n_Id,sr.vc_Name,sr.vc_Security_Name from sys_user_role sur LEFT JOIN sys_role sr on sur.n_Role_Id=sr.n_Id where sur.n_User_Id=#{userId}")
    List<SysRole> getRoleListByUserId(Integer userId);
    
    List<SysRole> findList(@Param("sysRole") SysRole sysRole);
    
    @Delete(value="delete from sys_user_role where n_User_Id=#{nUserId}")
    int deleteUserRoleListByUserId(Integer nUserId);
    
    @Delete(value="delete from sys_user_role where n_User_Id=#{nRoleId}")
    int deleteUserRoleListByRoleId(Integer nRoleId);
}