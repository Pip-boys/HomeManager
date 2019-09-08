package com.bibiboy.service.equip.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.bibiboy.bean.basic.SysUser;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.bean.equip.EquipData;
import com.bibiboy.bean.equip.EquipDataGroup;
import com.bibiboy.bean.equip.EquipDataTypeGroup;
import com.bibiboy.bean.equip.EquipDetail;
import com.bibiboy.bean.equip.EquipDetailExample;
import com.bibiboy.bean.equip.EquipDetailExample.Criteria;
import com.bibiboy.bean.equip.EquipMain;
import com.bibiboy.bean.equip.UserEquip;
import com.bibiboy.bean.equip.UserEquipDataGroup;
import com.bibiboy.bean.order.CodeInfo;
import com.bibiboy.bean.order.OrderInfo;
import com.bibiboy.bean.order.OrderInfoExample;
import com.bibiboy.mapper.equip.EquipDataMapper;
import com.bibiboy.mapper.equip.EquipDetailMapper;
import com.bibiboy.mapper.equip.EquipMainMapper;
import com.bibiboy.mapper.equip.UserEquipMapper;
import com.bibiboy.mapper.order.CodeInfoMapper;
import com.bibiboy.mapper.order.OrderInfoMapper;
import com.bibiboy.service.basic.ISysUserService;
import com.bibiboy.service.equip.IEquipMainService;
import com.bibiboy.util.GeneralParameter;
import com.bibiboy.util.GeneralTool;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class EquipServiceImpl implements IEquipMainService{
	
	@Autowired
	private EquipMainMapper equipMainMapper;
	
	@Autowired
	private EquipDetailMapper equipDetailMapper;
	
	@Autowired
	private EquipDataMapper equipDataMapper;
	
	@Autowired
	private ISysUserService sysUserService;
	
	@Autowired
	private UserEquipMapper userEquipMapper;
	
	@Autowired
	private CodeInfoMapper codeInfoMapper;
	
	@Autowired
	private OrderInfoMapper orderInfoMapper;
	
	@Override
	public PageResult findEquiMainListAndCompanyName(EquipMain equipMain, PageReceive pageReceive)throws Exception {
		PageHelper.startPage(pageReceive.getPageNum()+1, pageReceive.getPageSize());
		Page<EquipMain> page = (Page<EquipMain>)equipMainMapper.findEquiMainListAndCompanyName();
		List<EquipMain> result = page.getResult();
		for (EquipMain e : result) {
			e.setVcPic(GeneralParameter.NGINXHOST+e.getVcPic());
		}
		long total = page.getTotal();	
		return new PageResult(total, result);
	}

	@Override
	public BaseResult getEquipDetailList(Integer nId)throws Exception {
		EquipDetailExample example = new EquipDetailExample();
		Criteria criteria = example.createCriteria();
		criteria.andNPidEqualTo(nId);
		List<EquipDetail> equipDetailList = equipDetailMapper.selectByExample(example);
		return new BaseResult(equipDetailList);
	}
	
	//此方法已作废
	@Override
	public PageResult getUserSelfEquip(PageReceive pageReceive) throws Exception {
		PageHelper.startPage(pageReceive.getPageNum()+1, pageReceive.getPageSize());
		SysUser sysUser = sysUserService.getSysUserByRedis();
		Page<UserEquipDataGroup> page=(Page<UserEquipDataGroup>)equipDataMapper.getUserSelfEuqipData(sysUser.getnId());
		List<UserEquipDataGroup> result = page.getResult();
		for (UserEquipDataGroup ued : result) {
			ued.setVcPic(GeneralParameter.NGINXHOST+ued.getVcPic());
		}
		long total = page.getTotal();
		return new PageResult(total, result);
	}

	/*@Scheduled(cron = "0/1 * * * * ?")*/
	/*Logger logger = LoggerFactory.getLogger(EquipServiceImpl.class);
	logger.info("定时测试");*/
	@Override
	public PageResult getUserSelfAllEuqipDataList(PageReceive pageReceive) throws Exception {
		SysUser sysUser = sysUserService.getSysUserByRedis();
		Integer nId=sysUser.getnId();
		
		PageHelper.startPage(pageReceive.getPageNum()+1, pageReceive.getPageSize());
		Page<EquipDetail> page=(Page<EquipDetail>)userEquipMapper.getUserActivationEquipList(nId);
		List<EquipDetail> userEquipList = page.getResult();
		for (EquipDetail equipDetail : userEquipList) {
			equipDetail.setVcPic(GeneralParameter.NGINXHOST+equipDetail.getVcPic());
		}
		long total = page.getTotal();
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();
		for (EquipDetail equipDetail : userEquipList) {
			list.add(equipDetail.getnId());
			list2.add(equipDetail.getEquipDetailId());
		}
		
		List<EquipDataGroup> slowEquipDataList = equipDataMapper.getUserSlowEquipDataList(list);
		
		List<EquipDataGroup> fastEquipDataList = equipDataMapper.getUserFastEquipDataList(list);
		
		List<EquipDataTypeGroup> typeList = userEquipMapper.getUserEquipDataTypeList(sysUser.getnId());
		
		Map<String, Object> map = new HashMap<>();
		map.put("userEquipList", userEquipList);
		map.put("typeList", typeList);
		map.put("fastEquipDataList", fastEquipDataList);
		map.put("slowEquipDataList", slowEquipDataList);
		return new PageResult(total, null, map);
	}

	@Override
	public BaseResult userSelfFastEuqipDataList(String string) throws Exception {
		List<Integer> list = GeneralTool.stringToIntegerList(string);
		List<EquipDataGroup> fastEquipDataList = equipDataMapper.getUserFastEquipDataList(list);
		return new BaseResult(fastEquipDataList);
	}

	@Override
	public BaseResult userSelfSlowEuqipDataList(String string) throws Exception {
		List<Integer> list = GeneralTool.stringToIntegerList(string);
		List<EquipDataGroup> slowEquipDataList = equipDataMapper.getUserSlowEquipDataList(list);
		return new BaseResult(slowEquipDataList);
	}

	@Override
	public BaseResult updateUserEquip(UserEquip userEquip) throws Exception {
		userEquipMapper.updateByPrimaryKeySelective(userEquip);
		return new BaseResult("状态更新成功!");
	}

	@Override
	public BaseResult addUserSlowEquipData(EquipData equipData) throws Exception {
		equipData.setDtCre(new Date());
		equipData.setnShow(0);
		equipDataMapper.addSlowEquipData(equipData);
		return new BaseResult("success");
	}

	@Override
	public PageResult getUserEquipCodeInfoList(PageReceive pageReceive, CodeInfo codeInfo) throws Exception {
		SysUser sysUser = sysUserService.getSysUserByRedis();
		PageHelper.startPage(pageReceive.getPageNum()+1, pageReceive.getPageSize());
		Page<CodeInfo> page = (Page<CodeInfo>)codeInfoMapper.getUserEquipCodeInfoList(sysUser.getnId());
		List<CodeInfo> result = page.getResult();
		for (CodeInfo c : result) {
			if (c.getnId()==null) {
				c.clear();
			}
		}
		long total = page.getTotal();	
		return new PageResult(total, result);
	}
	
	@Override
	public CodeInfo getUserEquipCodeInfo(UserEquip userEquip) throws Exception {
		CodeInfo codeInfo = codeInfoMapper.getUserEquipCodeInfo(userEquip);
		return codeInfo;
	}

	@Override
	public BaseResult addUserEquip(UserEquip userEquip) throws Exception {
		SysUser sysUser = sysUserService.getSysUserByRedis();
		userEquip.setnUserId(sysUser.getnId());
		userEquip.setnStatus(false);
		userEquip.setDtReg(new Date());
		
		OrderInfoExample example = new OrderInfoExample();
		OrderInfoExample.Criteria criteria = example.createCriteria();
		criteria.andVcCodeEqualTo(userEquip.getVcCode());
		OrderInfo orderInfo = orderInfoMapper.selectByExample(example).get(0);
		userEquip.setnEquipDetailId(orderInfo.getnEquipId());
		userEquipMapper.insertSelective(userEquip);
		return new BaseResult("新增成功！");
	}

	//@Scheduled(cron = "0/5 * * * * ?")
	@Override
	public void addEquipDataSimulation() throws Exception {
		Date date = new Date();
		int i = (int)(Math.random()*100+1);
		EquipData equipData = new EquipData(1, "电量,%", i+"", date, 1);
		equipDataMapper.insertSimulation(equipData);
		i = new Random().nextInt(230-180)+180;
		equipData = new EquipData(1, "电压,V", i+"", date, 1);
		equipDataMapper.insertSimulation(equipData);
		i = new Random().nextInt(65-40)+40;
		equipData = new EquipData(1, "温度,℃", i+"", date, 1);
		equipDataMapper.insertSimulation(equipData);
		
		
		i = new Random().nextInt(230-180)+180;
		equipData = new EquipData(1, "电压,V", i+"", date, 2);
		equipDataMapper.insertSimulation(equipData);
		
		
		i = new Random().nextInt(230-180)+180;
		equipData = new EquipData(1, "电压,V", i+"", date, 3);
		equipDataMapper.insertSimulation(equipData);
		
		i = new Random().nextInt(120-60)+60;
		equipData = new EquipData(1, "心率,次/min", i+"", date, 4);
		equipDataMapper.insertSimulation(equipData);
		i = new Random().nextInt(44-34)+34;
		equipData = new EquipData(1, "体温,℃", i+"", date, 4);
		equipDataMapper.insertSimulation(equipData);
		i = (int)(Math.random()*100+1);
		equipData = new EquipData(1, "电量,%", i+"", date, 4);
		equipDataMapper.insertSimulation(equipData);
		
		i = (int)(Math.random()*100+1);
		equipData = new EquipData(1, "油量,%", i+"", date, 5);
		equipDataMapper.insertSimulation(equipData);
		i = new Random().nextInt(99-80)+80;
		equipData = new EquipData(1, "温度,℃", i+"", date, 5);
		equipDataMapper.insertSimulation(equipData);
		
		
	}

}
