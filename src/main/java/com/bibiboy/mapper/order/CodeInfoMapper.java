package com.bibiboy.mapper.order;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bibiboy.bean.equip.UserEquip;
import com.bibiboy.bean.order.CodeInfo;
import com.bibiboy.bean.order.CodeInfoExample;
import com.bibiboy.bean.order.CodeInfoKey;

public interface CodeInfoMapper {
    int countByExample(CodeInfoExample example);

    int deleteByExample(CodeInfoExample example);

    int deleteByPrimaryKey(CodeInfoKey key);

    int insert(CodeInfo record);

    int insertSelective(CodeInfo record);

    List<CodeInfo> selectByExample(CodeInfoExample example);

    CodeInfo selectByPrimaryKey(CodeInfoKey key);

    int updateByExampleSelective(@Param("record") CodeInfo record, @Param("example") CodeInfoExample example);

    int updateByExample(@Param("record") CodeInfo record, @Param("example") CodeInfoExample example);

    int updateByPrimaryKeySelective(CodeInfo record);

    int updateByPrimaryKey(CodeInfo record);
    
    @Select(value="select ed.vc_Name,ed.vc_Model,ed.vc_Item,ci.vc_Name vcCompanyName,ci.vc_Tel,et.vc_Name vcTypeName,oi.vc_Code,oi.n_User_Id from order_info oi LEFT JOIN equip_detail ed on ed.n_Id=oi.n_Equip_Id LEFT JOIN equip_main em on ed.n_Pid=em.n_Id LEFT JOIN equip_type et on ed.n_Type=et.n_Id LEFT JOIN company_info ci on ci.n_Id=em.n_Company where oi.n_Id=#{nId}")
    List<CodeInfo> getCodeInfoFormOrder(Integer nId);
    
    @Select(value="select ue.n_Id,ci.* from code_info ci LEFT JOIN user_equip ue on ue.vc_Code=ci.vc_Code where ci.n_User_Id=#{nUserId} ORDER BY ci.dt_Reg DESC")
    List<CodeInfo> getUserEquipCodeInfoList(Integer nUserId);
    
    @Select(value="select ue.n_Id,ci.* from code_info ci LEFT JOIN user_equip ue on ue.vc_Code=ci.vc_Code where ci.n_User_Id=#{nUserId} and ci.vc_Code=#{vcCode}")
    CodeInfo getUserEquipCodeInfo(UserEquip userEquip);
}