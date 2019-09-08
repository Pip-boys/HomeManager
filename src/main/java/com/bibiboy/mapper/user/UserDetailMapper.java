package com.bibiboy.mapper.user;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bibiboy.bean.user.UserDetail;
import com.bibiboy.bean.user.UserDetailExample;

public interface UserDetailMapper {
    int countByExample(UserDetailExample example);

    int deleteByExample(UserDetailExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(UserDetail record);

    int insertSelective(UserDetail record);

    List<UserDetail> selectByExample(UserDetailExample example);

    UserDetail selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") UserDetail record, @Param("example") UserDetailExample example);

    int updateByExample(@Param("record") UserDetail record, @Param("example") UserDetailExample example);

    int updateByPrimaryKeySelective(UserDetail record);

    int updateByPrimaryKey(UserDetail record);
    
    UserDetail getUserDetail(@Param("userDetail") UserDetail userDetail);
}