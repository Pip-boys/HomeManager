package com.bibiboy.service.equip.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.bean.equip.AdvertisementInfo;
import com.bibiboy.mapper.equip.AdvertisementInfoMapper;
import com.bibiboy.service.equip.IAdvertisementService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class AdvertisementServiceImpl implements IAdvertisementService{
	
	@Autowired
	private AdvertisementInfoMapper advertisementInfoMapper;
	
	@Override
	public PageResult findList(PageReceive pageReceive, AdvertisementInfo advertisementInfo) {
		PageHelper.startPage(1, 5);
		Page<AdvertisementInfo> page=(Page<AdvertisementInfo>)advertisementInfoMapper.findList();
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public BaseResult addAdvertisement(AdvertisementInfo advertisementInfo)throws Exception {
		advertisementInfoMapper.insertSelective(advertisementInfo);
		return new BaseResult("新增成功！");
	}

	@Override
	public BaseResult updateAdvertisement(AdvertisementInfo advertisementInfo)throws Exception {
		advertisementInfoMapper.updateByPrimaryKeySelective(advertisementInfo);
		return new BaseResult("更新成功！");
	}

	@Override
	public BaseResult deleteAdvertisement(Integer nId)throws Exception {
		advertisementInfoMapper.deleteByPrimaryKey(nId);
		return new BaseResult("删除成功！");
	}
		
	
}
