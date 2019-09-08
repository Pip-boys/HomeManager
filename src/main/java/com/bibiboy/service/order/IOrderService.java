package com.bibiboy.service.order;

import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.bean.order.OrderInfo;

public interface IOrderService {

	/**
	 * 用户获取自己的订单列表
	 * <p>Title: findList</p>  
	 * <p>Description: </p>  
	 * @param orderInfo
	 * @param pageReceive
	 * @return
	 * @throws Exception
	 */
	public PageResult findList(OrderInfo orderInfo, PageReceive pageReceive)throws Exception;
	
	/**
	 * 用户更新自己的订单状态
	 * <p>Title: updateOrderInfo</p>  
	 * <p>Description: </p>  
	 * @param orderInfo
	 * @return
	 * @throws Exception
	 */
	BaseResult updateOrderInfo(OrderInfo orderInfo) throws Exception;
	
	/**
	 * 用户下单
	 * <p>Title: addOrderInfo</p>  
	 * <p>Description: </p>  
	 * @param orderInfo
	 * @return
	 * @throws Exception
	 */
	BaseResult addOrderInfo(OrderInfo orderInfo) throws Exception;
	
	/**
	 * 删除订单
	 * <p>Title: deleteOrderInfo</p>  
	 * <p>Description: </p>  
	 * @param nId
	 * @return
	 * @throws Exception
	 */
	BaseResult deleteOrderInfo(Integer nId) throws Exception;
}
