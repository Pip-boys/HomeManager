package com.bibiboy.service.order.impl;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bibiboy.bean.basic.SysUser;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.bean.order.CodeInfo;
import com.bibiboy.bean.order.OrderInfo;
import com.bibiboy.bean.order.OrderInfoExample;
import com.bibiboy.bean.order.OrderInfoExample.Criteria;
import com.bibiboy.mapper.order.CodeInfoMapper;
import com.bibiboy.mapper.order.OrderInfoMapper;
import com.bibiboy.service.basic.ISysUserService;
import com.bibiboy.service.order.IOrderService;
import com.bibiboy.util.GeneralParameter;
import com.bibiboy.util.QRCodeUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class OrderServiceImpl implements IOrderService{
	
	@Autowired
	private OrderInfoMapper orderInfoMapper;
	
	@Autowired
    private ISysUserService sysUserService;
	
	@Autowired
	private CodeInfoMapper codeInfoMapper;
	
	@Override
	public PageResult findList(OrderInfo orderInfo, PageReceive pageReceive)throws Exception {
		SysUser sysUser = sysUserService.getSysUserByRedis();
		PageHelper.startPage(pageReceive.getPageNum()+1, pageReceive.getPageSize());
		Page<OrderInfo> page=(Page<OrderInfo>)orderInfoMapper.getOrderListByLogin(sysUser.getnId());
		List<OrderInfo> result = page.getResult();
		for (OrderInfo o : result) {
			o.setVcPic(GeneralParameter.NGINXHOST+o.getVcPic());
		}
		return new PageResult(page.getTotal(), result);
	}

	@Override
	@Transactional
	public BaseResult updateOrderInfo(OrderInfo orderInfo) throws Exception {
		orderInfo.setDtUpdate(new Date());
		orderInfoMapper.updateByPrimaryKeySelective(orderInfo);
		
		if (orderInfo.getnStatus()==3) {
			CodeInfo codeInfo = codeInfoMapper.getCodeInfoFormOrder(orderInfo.getnId()).get(0);
			codeInfo.setDtReg(new Date());
			codeInfoMapper.insertSelective(codeInfo);
		}
		
		String msg=null;
		switch (orderInfo.getnStatus()) {
		case 1:
			msg="已付款";
			break;
		case 2:
			msg="已付款";
			break;
		case 3:
			msg="已签收";
			break;
		case 4:
			msg="已评价";
			break;
		case 5:
			msg="已发起退货";
			break;
		case 6:
			msg="退货成功";
			break;
		default:
			msg="数据异常";
			break;
		}
		return new BaseResult(msg);
	}
	
	//为什么不使用前台传来的用户信息而非要去redis中取?因为前台传来的信息相对不安全！
	@Override
	@Transactional
	public BaseResult addOrderInfo(OrderInfo orderInfo) throws Exception {
		SysUser sysUser = sysUserService.getSysUserByRedis();
		orderInfo.setnUserId(sysUser.getnId());
		orderInfo.setnStatus(0);
		orderInfo.setDtOrder(new Date());
		orderInfo.setDtUpdate(new Date());
		String vcCode=sysUser.getnId()+(((int)((Math.random()*9+1)*100000))+"");
		orderInfo.setVcCode(vcCode);
		orderInfoMapper.insertSelective(orderInfo);
		
		
		String filepath = GeneralParameter.SERVICEPATH+"images/qcode/"+vcCode+".jpg";
        String content = vcCode;
        String logoImgPath = "F:/nginx-1.15.8/html/imaages/test.jpg";
        File file = new File(filepath);
        QRCodeUtil.encode(content, logoImgPath, new FileOutputStream(file), true);
        
		return new BaseResult("下单成功！");
	}

	@Override
	public BaseResult deleteOrderInfo(Integer nId) throws Exception {
		orderInfoMapper.deleteByPrimaryKey(nId);
		return new BaseResult("删除成功！");
	}
	
}
