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
import com.bibiboy.bean.order.RepairInfo;
import com.bibiboy.service.order.IRepairService;

@RestController
@RequestMapping(value="/repair")
public class RepairController {
	
	@Autowired
	private IRepairService repairService;
	
	@GetMapping(value="/repair",produces = {"application/json;charset=UTF-8"})
	public PageResult findList(RepairInfo repairInfo, PageReceive pageReceive)throws Exception{
		return repairService.findList(repairInfo, pageReceive);
	}
	
	@GetMapping(value="/repairHistory",produces = {"application/json;charset=UTF-8"})
	public PageResult findListHistory(RepairInfo repairInfo, PageReceive pageReceive)throws Exception{
		return repairService.findListHistory(repairInfo, pageReceive);
	}
	
	@PutMapping(value="/repair",consumes = {"application/json;charset=UTF-8"})
	public BaseResult addRepairInfo(@RequestBody RepairInfo repairInfo)throws Exception{
		return repairService.addRepairInfo(repairInfo);
	}
	
	@PostMapping(value="/repair",consumes = {"application/json;charset=UTF-8"})
	public BaseResult updateRepairInfo(@RequestBody RepairInfo repairInfo)throws Exception{
		return repairService.updateRepairInfo(repairInfo);
	}
	
	@DeleteMapping(value="/repair/{nId}",produces = {"application/json;charset=UTF-8"})
	public BaseResult deleteRepairInfo(@PathVariable("nId") Integer nId)throws Exception{
		return repairService.deleteRepairInfo(nId);
	}
	
}
