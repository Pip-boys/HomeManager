package com.bibiboy.mapper.equip;

import com.bibiboy.bean.equip.EquipDetail;
import com.bibiboy.bean.equip.EquipDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EquipDetailMapper {
    int countByExample(EquipDetailExample example);

    int deleteByExample(EquipDetailExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(EquipDetail record);

    int insertSelective(EquipDetail record);

    List<EquipDetail> selectByExample(EquipDetailExample example);

    EquipDetail selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") EquipDetail record, @Param("example") EquipDetailExample example);

    int updateByExample(@Param("record") EquipDetail record, @Param("example") EquipDetailExample example);

    int updateByPrimaryKeySelective(EquipDetail record);

    int updateByPrimaryKey(EquipDetail record);
    
    
}