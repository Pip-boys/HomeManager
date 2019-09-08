package com.bibiboy.controller.equip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.bean.equip.AdvertisementInfo;
import com.bibiboy.service.equip.IAdvertisementService;

@RestController
@RequestMapping(value="/advertisement")
public class AdvertisementController {
	
	@Autowired
	private IAdvertisementService advertisementService;
	
	@RequestMapping(value="/advertisement",method= {RequestMethod.GET})
	public PageResult findList(PageReceive pageReceive,AdvertisementInfo advertisementInfo) {
		return advertisementService.findList(pageReceive, advertisementInfo);
	}
	
	@RequestMapping(value="/advertisements",method= {RequestMethod.POST})
	public PageResult findLists(PageReceive pageReceive,AdvertisementInfo advertisementInfo) {
		return advertisementService.findList(pageReceive, advertisementInfo);
	}
	
	@PutMapping(value="/advertisement",consumes= {"application/json;charset=UTF-8"})
	public BaseResult addAdvertisement(AdvertisementInfo advertisementInfo)throws Exception{
		return advertisementService.addAdvertisement(advertisementInfo);
	}
	
	@PostMapping(value="/advertisement",consumes= {"application/json;charset=UTF-8"})
	public BaseResult updateAdvertisement(AdvertisementInfo advertisementInfo)throws Exception{
		return advertisementService.updateAdvertisement(advertisementInfo);
	}
	
	@RequestMapping(value="/advertisement/{nId}",method = { RequestMethod.DELETE })
	public BaseResult deleteAdvertisement(Integer nId)throws Exception{
		return advertisementService.deleteAdvertisement(nId);
	}
	
}
