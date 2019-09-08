package com.bibiboy.service.user;

import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.user.UserDetail;

public interface IUserDetailService {
	
	/**
	 * 获取用户详情信息
	 * <p>Title: getUserDetail</p>  
	 * <p>Description: </p>  
	 * @param userDetail
	 * @return
	 * @throws Exception
	 */
	BaseResult getUserDetail(UserDetail userDetail)throws Exception;
	
	/**
	 * 更新用户详情信息
	 * <p>Title: updateUserDetail</p>  
	 * <p>Description: </p>  
	 * @param userDetail
	 * @return
	 * @throws Exception
	 */
	BaseResult updateUserDetail(UserDetail userDetail)throws Exception;
	
}
