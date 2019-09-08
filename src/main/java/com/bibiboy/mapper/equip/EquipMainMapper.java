package com.bibiboy.mapper.equip;

import com.bibiboy.bean.equip.EquipMain;
import com.bibiboy.bean.equip.EquipMainExample;
import com.bibiboy.bean.equip.UserEquip;
import com.bibiboy.bean.order.CodeInfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface EquipMainMapper {
    int countByExample(EquipMainExample example);

    int deleteByExample(EquipMainExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(EquipMain record);

    int insertSelective(EquipMain record);

    List<EquipMain> selectByExampleWithBLOBs(EquipMainExample example);

    List<EquipMain> selectByExample(EquipMainExample example);

    EquipMain selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") EquipMain record, @Param("example") EquipMainExample example);

    int updateByExampleWithBLOBs(@Param("record") EquipMain record, @Param("example") EquipMainExample example);

    int updateByExample(@Param("record") EquipMain record, @Param("example") EquipMainExample example);

    int updateByPrimaryKeySelective(EquipMain record);

    int updateByPrimaryKeyWithBLOBs(EquipMain record);

    int updateByPrimaryKey(EquipMain record);
    
    @Select(value="select em.*,ci.vc_Name companyName,et.vc_Name typeName from equip_main em LEFT JOIN company_info ci on em.n_Company=ci.n_Id LEFT JOIN equip_type et on et.n_Id=em.n_Type ORDER BY dt_Reg DESC")
    List<EquipMain> findEquiMainListAndCompanyName();

}