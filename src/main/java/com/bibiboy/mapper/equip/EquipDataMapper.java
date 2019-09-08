package com.bibiboy.mapper.equip;

import com.bibiboy.bean.equip.EquipData;
import com.bibiboy.bean.equip.EquipDataExample;
import com.bibiboy.bean.equip.EquipDataGroup;
import com.bibiboy.bean.equip.EquipDataType;
import com.bibiboy.bean.equip.EquipDetail;
import com.bibiboy.bean.equip.UserEquip;
import com.bibiboy.bean.equip.UserEquipDataGroup;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface EquipDataMapper {
    int countByExample(EquipDataExample example);

    int deleteByExample(EquipDataExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(EquipData record);

    int insertSelective(EquipData record);

    List<EquipData> selectByExample(EquipDataExample example);

    EquipData selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") EquipData record, @Param("example") EquipDataExample example);

    int updateByExample(@Param("record") EquipData record, @Param("example") EquipDataExample example);

    int updateByPrimaryKeySelective(EquipData record);

    int updateByPrimaryKey(EquipData record);
    
    List<UserEquipDataGroup> getUserSelfEuqipData(Integer nUserId);
    
    List<EquipDataGroup> getUserSlowEquipDataList(List<Integer> list);
    
    List<EquipDataGroup> getUserFastEquipDataList(List<Integer> list);
    
    List<EquipDataType> getUserEquipDataTypeList(List<Integer> list);
    
    @Insert(value="insert into equip_data(`n_Show`, `n_Pid`, `vc_Data_Name`, `vc_Data`, `dt_Cre`) VALUE(#{nShow},#{nPid},#{vcDataName},#{vcData},#{dtCre})")
    int addSlowEquipData(EquipData equipData);
    
    @Insert(value="insert into equip_data(`n_Show`, `n_Pid`, `vc_Data_Name`, `vc_Data`, `dt_Cre`) VALUE(#{nShow},#{nPid},#{vcDataName},#{vcData},#{dtCre})")
    int insertSimulation(EquipData equipData);
}