package com.bibiboy.mapper.equip;

import com.bibiboy.bean.equip.EquipDataType;
import com.bibiboy.bean.equip.EquipDataTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipDataTypeMapper {
    int countByExample(EquipDataTypeExample example);

    int deleteByExample(EquipDataTypeExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(EquipDataType record);

    int insertSelective(EquipDataType record);

    List<EquipDataType> selectByExample(EquipDataTypeExample example);

    EquipDataType selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") EquipDataType record, @Param("example") EquipDataTypeExample example);

    int updateByExample(@Param("record") EquipDataType record, @Param("example") EquipDataTypeExample example);

    int updateByPrimaryKeySelective(EquipDataType record);

    int updateByPrimaryKey(EquipDataType record);
}