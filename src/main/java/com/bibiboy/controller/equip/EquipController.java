package com.bibiboy.controller.equip;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bibiboy.annotation.MyLog;
import com.bibiboy.annotation.MyLog.Test;
import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.bean.equip.EquipData;
import com.bibiboy.bean.equip.EquipMain;
import com.bibiboy.bean.equip.UserEquip;
import com.bibiboy.bean.order.CodeInfo;
import com.bibiboy.service.equip.IEquipMainService;

@RestController
@RequestMapping(value="/equip")
public class EquipController {
	
	@Autowired
	private IEquipMainService equipMainService;
	
	@GetMapping(value="/equipMain",produces = {"application/json;charset=UTF-8"})
	public PageResult findEquiMainListAndCompanyName(EquipMain equipMain,@Valid PageReceive pageReceive) throws Exception {
		return equipMainService.findEquiMainListAndCompanyName(equipMain, pageReceive);
	}
	
	@GetMapping(value="/equipDetail/{nId}",produces = {"application/json;charset=UTF-8"})
	public BaseResult getEquipDetailList(@PathVariable("nId") Integer nId) throws Exception {
		return equipMainService.getEquipDetailList(nId);
	}
	
	//此方法已作废
	@GetMapping(value="/userSelfEquip",produces = {"application/json;charset=UTF-8"})
	public PageResult getUserSelfEquip(PageReceive pageReceive) throws Exception {
		return equipMainService.getUserSelfEquip(pageReceive);
	}
	
	@MyLog(test=Test.ADD)
	@GetMapping(value="/userSelfAllEuqipDataList",produces = {"application/json;charset=UTF-8"})
	public PageResult userSelfAllEuqipDataList(PageReceive pageReceive) throws Exception{
		PageResult userSelfAllEuqipDataList = equipMainService.getUserSelfAllEuqipDataList(pageReceive);
		return userSelfAllEuqipDataList;
	}
	
	
	@GetMapping(value="/userSelfFastEuqipDataList/{list}",produces = {"application/json;charset=UTF-8"})
	public BaseResult userSelfFastEuqipDataList(@PathVariable("list") String list) throws Exception{
		return equipMainService.userSelfFastEuqipDataList(list);
	}
	
	@GetMapping(value="/userSelfSlowEuqipDataList/{list}",produces = {"application/json;charset=UTF-8"})
	public BaseResult userSelfSlowEuqipDataList(@PathVariable("list") String list) throws Exception{
		return equipMainService.userSelfSlowEuqipDataList(list);
	}
	
	@PostMapping(value="/userEquip",consumes = {"application/json;charset=UTF-8"})
	public BaseResult updateUserEquip(@RequestBody UserEquip userEquip) throws Exception{
		return equipMainService.updateUserEquip(userEquip);
	}
	
	@PutMapping(value="/userSlowEquipData",consumes = {"application/json;charset=UTF-8"})
	public BaseResult addUserSlowEquipData(@RequestBody EquipData equipData) throws Exception{
		return equipMainService.addUserSlowEquipData(equipData);
	}
	
	@GetMapping(value="/codeInfo",produces = {"application/json;charset=UTF-8"})
	public PageResult getUserEquipCodeInfoList(PageReceive pageReceive, CodeInfo codeInfo) throws Exception{
		return equipMainService.getUserEquipCodeInfoList(pageReceive, codeInfo);
	}
	
	@PutMapping(value="/userEquip",consumes = {"application/json;charset=UTF-8"})
	public BaseResult addUserEquip(@RequestBody UserEquip userEquip) throws Exception{
		return equipMainService.addUserEquip(userEquip);
	}
}
