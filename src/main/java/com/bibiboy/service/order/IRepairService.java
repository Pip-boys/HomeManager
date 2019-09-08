package com.bibiboy.service.order;

import org.springframework.web.bind.annotation.RequestBody;

import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.bean.order.RepairInfo;

public interface IRepairService {
	
	/**
	 * 获取维修清单
	 * <p>Title: findList</p>  
	 * <p>Description: </p>  
	 * @param repairInfo
	 * @param pageReceive
	 * @return
	 * @throws Exception
	 */
	public PageResult findList(RepairInfo repairInfo, PageReceive pageReceive)throws Exception;
	
	/**
	 * 维修工查看自己的维修清单历史
	 * <p>Title: findListHistory</p>  
	 * <p>Description: </p>  
	 * @param repairInfo
	 * @param pageReceive
	 * @return
	 * @throws Exception
	 */
	public PageResult findListHistory(RepairInfo repairInfo, PageReceive pageReceive)throws Exception;
	
	/**
	 * 新增维护清单
	 * <p>Title: addRepairInfo</p>  
	 * <p>Description: </p>  
	 * @param repairInfo
	 * @param pageReceive
	 * @return
	 * @throws Exception
	 */
	public BaseResult addRepairInfo(@RequestBody RepairInfo repairInfo)throws Exception;
	
	/**
	 * 更新维护清单
	 * <p>Title: updateRepairInfo</p>  
	 * <p>Description: </p>  
	 * @param repairInfo
	 * @param pageReceive
	 * @return
	 * @throws Exception
	 */
	public BaseResult updateRepairInfo(@RequestBody RepairInfo repairInfo)throws Exception;

	/**
	 * 删除维护清单
	 * <p>Title: deleteRepairInfo</p>  
	 * <p>Description: </p>  
	 * @param nId
	 * @return
	 * @throws Exception
	 */
	public BaseResult deleteRepairInfo(Integer nId)throws Exception;
	
}
