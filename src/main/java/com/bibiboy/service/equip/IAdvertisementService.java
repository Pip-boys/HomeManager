package com.bibiboy.service.equip;

import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.bean.equip.AdvertisementInfo;

public interface IAdvertisementService {
	
	public PageResult findList(PageReceive pageReceive, AdvertisementInfo advertisementInfo);
	
	public BaseResult addAdvertisement(AdvertisementInfo advertisementInfo)throws Exception;
	
	public BaseResult updateAdvertisement(AdvertisementInfo advertisementInfo)throws Exception;
	
	public BaseResult deleteAdvertisement(Integer nId)throws Exception;
}
