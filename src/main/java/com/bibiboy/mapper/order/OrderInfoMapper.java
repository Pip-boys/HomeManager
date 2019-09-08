package com.bibiboy.mapper.order;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bibiboy.bean.order.OrderInfo;
import com.bibiboy.bean.order.OrderInfoExample;

public interface OrderInfoMapper {
    int countByExample(OrderInfoExample example);

    int deleteByExample(OrderInfoExample example);

    int deleteByPrimaryKey(Integer nId);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    List<OrderInfo> selectByExample(OrderInfoExample example);

    OrderInfo selectByPrimaryKey(Integer nId);

    int updateByExampleSelective(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByExample(@Param("record") OrderInfo record, @Param("example") OrderInfoExample example);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
    
    @Select(value="select oi.*,ed.vc_Name,ed.vc_Model,ed.vc_Pic from order_info oi LEFT JOIN equip_detail ed on ed.n_Id=oi.n_Equip_Id where oi.n_User_Id=#{nUserId} order by oi.dt_Update desc")
    List<OrderInfo> getOrderListByLogin(Integer nUserId);
}