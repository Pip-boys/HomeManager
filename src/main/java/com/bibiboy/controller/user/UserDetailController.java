package com.bibiboy.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.bean.user.UserDetail;
import com.bibiboy.service.user.IUserDetailService;

@RestController
@RequestMapping(value="/userDetail")
public class UserDetailController {
	
	@Autowired
	private IUserDetailService userDetailService;
	
	//这里也是，不能使用前台传来的参数，必须使用服务器上的
	@RequestMapping(value="/userDetail",method = { RequestMethod.GET })
	//@Validated
	public BaseResult getUserDetail(UserDetail userDetail) throws Exception {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String name = authentication.getName();
		return userDetailService.getUserDetail(new UserDetail(name));
	}
	
	@RequestMapping(value="/userDetail",consumes = {"application/json;charset=UTF-8"},method = { RequestMethod.POST })
	public BaseResult updateUserDetail(@RequestBody @Validated UserDetail userDetail) throws Exception {
		return userDetailService.updateUserDetail(userDetail);
	}
}
