package com.bibiboy.mapper.order;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bibiboy.bean.order.RepairInfo;
import com.bibiboy.bean.order.RepairInfoExample;

public interface RepairInfoMapper {
    int countByExample(RepairInfoExample example);

    int deleteByExample(RepairInfoExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(RepairInfo record);

    int insertSelective(RepairInfo record);

    List<RepairInfo> selectByExampleWithBLOBs(RepairInfoExample example);

    List<RepairInfo> selectByExample(RepairInfoExample example);

    RepairInfo selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") RepairInfo record, @Param("example") RepairInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") RepairInfo record, @Param("example") RepairInfoExample example);

    int updateByExample(@Param("record") RepairInfo record, @Param("example") RepairInfoExample example);

    int updateByPrimaryKeySelective(RepairInfo record);

    int updateByPrimaryKeyWithBLOBs(RepairInfo record);

    int updateByPrimaryKey(RepairInfo record);
    
    @Select(value="select ud.vc_Name,su.vc_Tel,ed.vc_Name equipName,ed.vc_Model,ri.* from repair_info ri LEFT JOIN user_detail ud on ud.n_Id=ri.n_Repairer_Id LEFT JOIN sys_user su on su.n_Id=ud.n_Id LEFT JOIN equip_detail ed on ed.n_Id=ri.n_Equip_Id where ri.n_User_Id=#{nUserId}")
    List<RepairInfo> getRepairInfoListByUser(Integer nUserId);
    
    @Select(value="select ud.vc_Name,su.vc_Tel,ed.vc_Name equipName,ed.vc_Model,ud.vc_Place,ri.* from repair_info ri LEFT JOIN user_detail ud on ud.n_Id=ri.n_User_Id LEFT JOIN sys_user su on su.n_Id=ud.n_Id LEFT JOIN equip_detail ed on ed.n_Id=ri.n_Equip_Id where ri.n_Status=0 ORDER BY ri.dt_Reg DESC")
    List<RepairInfo> getRepairInfoListBynRepairer();
    
    @Select(value="select ud.vc_Name,su.vc_Tel,ed.vc_Name equipName,ed.vc_Model,ud.vc_Place,ri.* from repair_info ri LEFT JOIN user_detail ud on ud.n_Id=ri.n_User_Id LEFT JOIN sys_user su on su.n_Id=ud.n_Id LEFT JOIN equip_detail ed on ed.n_Id=ri.n_Equip_Id where ri.n_Repairer_Id=#{nRepairerId} ORDER BY ri.dt_Reg DESC")
    List<RepairInfo> getRepairInfoHistoryListBynRepairere(Integer nRepairerId);
}