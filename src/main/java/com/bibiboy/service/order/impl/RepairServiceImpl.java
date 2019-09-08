package com.bibiboy.service.order.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.bibiboy.bean.basic.SysUser;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.bean.order.RepairInfo;
import com.bibiboy.mapper.basic.SysUserMapper;
import com.bibiboy.mapper.order.RepairInfoMapper;
import com.bibiboy.service.basic.ISysUserService;
import com.bibiboy.service.order.IRepairService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class RepairServiceImpl implements IRepairService{
	
	@Autowired
    private ISysUserService sysUserService;
	
	@Autowired
    private SysUserMapper sysUserMapper;
	
	@Autowired
	private RepairInfoMapper repairInfoMapper;
	
	public PageResult findList(RepairInfo repairInfo, PageReceive pageReceive)throws Exception{
		String vcUserName = SecurityContextHolder.getContext().getAuthentication().getName();
		
		SysUser sysUser = sysUserMapper.getOnebyUserName(vcUserName);
		Integer nType = sysUser.getnType();
		
		PageHelper.startPage(pageReceive.getPageNum()+1, pageReceive.getPageSize());
		Page<RepairInfo> page=null;
		if (nType==1) {
			page=(Page<RepairInfo>)repairInfoMapper.getRepairInfoListBynRepairer();
		}else if (nType==0) {
			page=(Page<RepairInfo>)repairInfoMapper.getRepairInfoListByUser(sysUser.getnId());
		}
		
		List<RepairInfo> result = page.getResult();
		return new PageResult(page.getTotal(), result);
	}

	@Override
	public BaseResult addRepairInfo(RepairInfo repairInfo) throws Exception {
		SysUser sysUser = sysUserService.getSysUserByRedis();
		repairInfo.setDtReg(new Date());
		repairInfo.setnStatus(0);
		repairInfo.setnUserId(sysUser.getnId());
		repairInfoMapper.insertSelective(repairInfo);
		return new BaseResult("提交成功！");
	}

	@Override
	public BaseResult updateRepairInfo(RepairInfo repairInfo) throws Exception {
		String msg=null;
		if (repairInfo.getVcType()==null) {
			SysUser sysUser = sysUserService.getSysUserByRedis();
			repairInfo.setnRepairerId(sysUser.getnId());
			msg="成功接单！";
		}else {
			msg="更新成功！";
		}
		repairInfoMapper.updateByPrimaryKeySelective(repairInfo);
		return new BaseResult(msg);
	}

	@Override
	public BaseResult deleteRepairInfo(Integer nId) throws Exception {
		repairInfoMapper.deleteByPrimaryKey(nId);
		return new BaseResult("删除成功！");
	}

	@Override
	public PageResult findListHistory(RepairInfo repairInfo, PageReceive pageReceive) throws Exception {
		SysUser sysUser = sysUserService.getSysUserByRedis();
		PageHelper.startPage(pageReceive.getPageNum()+1, pageReceive.getPageSize());
		Page<RepairInfo> page=(Page<RepairInfo>)repairInfoMapper.getRepairInfoHistoryListBynRepairere(sysUser.getnId());
		List<RepairInfo> result = page.getResult();
		return new PageResult(page.getTotal(), result);
	}
	
}
