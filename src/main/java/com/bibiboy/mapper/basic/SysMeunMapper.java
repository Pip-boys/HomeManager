package com.bibiboy.mapper.basic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bibiboy.bean.basic.SysMeun;
import com.bibiboy.bean.basic.SysMeunExample;
import com.github.pagehelper.Page;

public interface SysMeunMapper {
    int countByExample(SysMeunExample example);

    int deleteByExample(SysMeunExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(SysMeun record);

    int insertSelective(SysMeun record);

    List<SysMeun> selectByExample(SysMeunExample example);

    SysMeun selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") SysMeun record, @Param("example") SysMeunExample example);

    int updateByExample(@Param("record") SysMeun record, @Param("example") SysMeunExample example);

    int updateByPrimaryKeySelective(SysMeun record);

    int updateByPrimaryKey(SysMeun record);
    
    @Select(value="select sm.* from sys_meun sm Inner JOIN sys_user_meun sum on sm.n_Id=sum.n_Menu_Id INNER JOIN sys_user su on sum.n_User_Id=su.n_Id where su.vc_User_Name=#{userName}")
    Page<SysMeun> findMenuListByUserName(String userName);
    
    @Select(value="SELECT sm.* FROM sys_meun sm INNER JOIN sys_user_meun sum ON sm.n_Id = sum.n_Menu_Id WHERE sum.n_User_Id=#{nUserId}")
    List<SysMeun> findMenuListByUserId(Integer nId);
    
    @Delete(value="delete from sys_user_meun where n_Menu_Id=#{nMenuId}")
    int deleteUserMenuListByMenuId(Integer nMenuId);
    
    @Delete(value="delete from sys_user_meun where n_User_Id=#{nUserId}")
    int deleteUserMenuListByUserId(Integer nUserId);
    
    int insertSysUserMenuBatch(Map<String, Object> map);
    
    @Insert(value="insert into sys_user_meun VALUES (#{nId},1),(#{nId},2),(#{nId},3)")
    int insertInitUserManagerMenu(Integer nId);
    
    @Insert(value="insert into sys_user_meun VALUES (#{nId},6),(#{nId},7),(#{nId},8),(#{nId},9),(#{nId},10)")
    int insertInitUserMenu(Integer nId);
    
}