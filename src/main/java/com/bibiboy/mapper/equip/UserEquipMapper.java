package com.bibiboy.mapper.equip;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bibiboy.bean.equip.EquipDataTypeGroup;
import com.bibiboy.bean.equip.EquipDetail;
import com.bibiboy.bean.equip.UserEquip;
import com.bibiboy.bean.equip.UserEquipExample;

public interface UserEquipMapper {
    int countByExample(UserEquipExample example);

    int deleteByExample(UserEquipExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(UserEquip record);

    int insertSelective(UserEquip record);

    List<UserEquip> selectByExample(UserEquipExample example);

    UserEquip selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") UserEquip record, @Param("example") UserEquipExample example);

    int updateByExample(@Param("record") UserEquip record, @Param("example") UserEquipExample example);

    int updateByPrimaryKeySelective(UserEquip record);

    int updateByPrimaryKey(UserEquip record);
    
    @Select(value="select ue.vc_Code,ue.n_Id,ue.n_Status,ed.n_Type,ed.vc_Name,ed.vc_Model,ed.vc_Item,ed.vc_Pic,ed.d_Price,ed.n_Id equipDetailId from user_equip  ue LEFT JOIN equip_detail ed on ed.n_Id=ue.n_Equip_Detail_Id where ue.n_User_Id=#{nId}")
    List<EquipDetail> getUserActivationEquipList(Integer nId);
    
    List<EquipDataTypeGroup> getUserEquipDataTypeList(Integer nId);
    
    
}