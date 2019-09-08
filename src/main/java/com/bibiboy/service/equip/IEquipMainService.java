package com.bibiboy.service.equip;

import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.entity.PageReceive;
import com.bibiboy.bean.entity.PageResult;
import com.bibiboy.bean.equip.EquipData;
import com.bibiboy.bean.equip.EquipMain;
import com.bibiboy.bean.equip.UserEquip;
import com.bibiboy.bean.order.CodeInfo;

public interface IEquipMainService {
	
	/**
	 * 所有设备列表以及公司名称
	 * <p>Title: findEquiMainListAndCompanyName</p>  
	 * <p>Description: </p>  
	 * @param equipMain
	 * @param pageReceive
	 * @return
	 * @throws Exception
	 */
	public PageResult findEquiMainListAndCompanyName(EquipMain equipMain, PageReceive pageReceive)throws Exception;
	
	/**
	 * 根据设备主表获取设备细表列表
	 * <p>Title: getEquipDetailList</p>  
	 * <p>Description: </p>  
	 * @param nId
	 * @return
	 * @throws Exception
	 */
	public BaseResult getEquipDetailList(Integer nId)throws Exception;
	
	/**
	 * 用户获取自己的设备列表
	 * <p>Title: getUserSelfEquip</p>  
	 * <p>Description: </p>  
	 * @param pageReceive
	 * @return
	 * @throws Exception
	 */
	public PageResult getUserSelfEquip(PageReceive pageReceive)throws Exception;
	
	/**
	 * 用户获取自己的全部设备数据列表
	 * <p>Title: getUserEquipDataList</p>  
	 * <p>Description: </p>  
	 * @return
	 */
	public PageResult getUserSelfAllEuqipDataList(PageReceive pageReceive)throws Exception;
	
	/**
	 * 用户获取自己全部的快查询列表
	 * <p>Title: userSelfSlowEuqipDataList</p>  
	 * <p>Description: </p>  
	 * @param list
	 * @return
	 * @throws Exception
	 */
	public BaseResult userSelfFastEuqipDataList(String list) throws Exception;
	
	/**
	 * 用户获取自己全部的慢查询列表
	 * <p>Title: userSelfSlowEuqipDataList</p>  
	 * <p>Description: </p>  
	 * @param list
	 * @return
	 * @throws Exception
	 */
	public BaseResult userSelfSlowEuqipDataList(String list) throws Exception;
	
	/**
	 * 更新用户的设备激活状态
	 * <p>Title: updateUserEquipStatus</p>  
	 * <p>Description: </p>  
	 * @param userEquip
	 * @return
	 * @throws Exception
	 */
	public BaseResult updateUserEquip(UserEquip userEquip) throws Exception;
	
	/**
	 * 新增用户设备的 慢 数据
	 * <p>Title: addUserEquipData</p>  
	 * <p>Description: </p>  
	 * @param userEquip
	 * @return
	 * @throws Exception
	 */
	public BaseResult addUserSlowEquipData(EquipData userEquip) throws Exception;
	
	/**
	 * 获取用户激活和未激活的设备列表
	 * <p>Title: getUserEquipCodeInfoList</p>  
	 * <p>Description: </p>  
	 * @param pageReceive
	 * @param codeInfo
	 * @return
	 * @throws Exception
	 */
	public PageResult getUserEquipCodeInfoList(PageReceive pageReceive, CodeInfo codeInfo)throws Exception;
	
	/**
	 * 获取某个用户的某个激活设备信息
	 * <p>Title: getUserEquipCodeInfo</p>  
	 * <p>Description: </p>  
	 * @param nUserId
	 * @return
	 * @throws Exception
	 */
	public CodeInfo getUserEquipCodeInfo(UserEquip userEquip) throws Exception;
	
	/**
	 * 新增用户设备
	 * <p>Title: addUserEquip</p>  
	 * <p>Description: </p>  
	 * @param userEquip
	 * @return
	 * @throws Exception
	 */
	public BaseResult addUserEquip(UserEquip userEquip) throws Exception;
	
	/**
	 * 模拟数据采集
	 * <p>Title: addEquipDataSimulation</p>  
	 * <p>Description: </p>  
	 * @throws Exception
	 */
	void addEquipDataSimulation()throws Exception;
}
