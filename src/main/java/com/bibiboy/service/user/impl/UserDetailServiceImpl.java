package com.bibiboy.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.user.UserDetail;
import com.bibiboy.bean.user.UserDetailExample;
import com.bibiboy.bean.user.UserDetailExample.Criteria;
import com.bibiboy.mapper.user.UserDetailMapper;
import com.bibiboy.service.user.IUserDetailService;
import com.bibiboy.util.GeneralParameter;

@Service
public class UserDetailServiceImpl implements IUserDetailService{
	
	@Autowired
	private UserDetailMapper userDetailMapper;
	
	@Override
	public BaseResult getUserDetail(UserDetail userDetails)throws Exception {
		UserDetail userDetail = userDetailMapper.getUserDetail(userDetails);
		return new BaseResult(200, null, userDetail);
	}

	@Override
	public BaseResult updateUserDetail(UserDetail userDetail) throws Exception {
		userDetail.setVcPic(userDetail.getVcPic().replace(GeneralParameter.NGINXHOST, ""));
		UserDetailExample userDetailExample = new UserDetailExample();
		Criteria criteria = userDetailExample.createCriteria();
		criteria.andVcUserNameEqualTo(userDetail.getVcUserName());
		userDetailMapper.updateByExampleSelective(userDetail, userDetailExample);
		return new BaseResult(200, "更新成功!");
	}
	
	
	
}
