package com.bibiboy.controller.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.bean.order.OrderInfo;
import com.bibiboy.service.order.IOrderService;

@RestController
@RequestMapping(value="/order")
public class OrderController {
	
	@Autowired
	private IOrderService orderService;
	
	@GetMapping(value="/order",produces = {"application/json;charset=UTF-8"})
	public PageResult findList(OrderInfo orderInfo,PageReceive pageReceive)throws Exception {
		return orderService.findList(orderInfo, pageReceive);
	}
	
	@PostMapping(value="/order",consumes = {"application/json;charset=UTF-8"})
	BaseResult updateOrderInfo(@RequestBody OrderInfo orderInfo) throws Exception {
		return orderService.updateOrderInfo(orderInfo);
	}
	
	@PutMapping(value="/order",consumes = {"application/json;charset=UTF-8"})
	public BaseResult addOrderInfo(@RequestBody OrderInfo orderInfo) throws Exception{
		return orderService.addOrderInfo(orderInfo);
	}
	
	@DeleteMapping(value="/order/{nId}",produces = {"application/json;charset=UTF-8"})
	BaseResult deleteOrderInfo(@PathVariable("nId") Integer nId) throws Exception {
		return orderService.deleteOrderInfo(nId);
	}

}
