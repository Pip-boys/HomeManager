package com.bibiboy.service.generator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import com.bibiboy.bean.entity.BaseResult;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Securtiy处理失败handler
* <p>Title: MyAuthenticationFailHander</p>  
* @author 哔哔小子
* @date 2019年1月2日
 */
@Component
public class MyAuthenticationFailHander implements AuthenticationFailureHandler {
	
	@Autowired
    private ObjectMapper objectMapper;
	
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
    	BaseResult baseResult;
    	String msg;
    	httpServletResponse.setContentType("application/json;charset=UTF-8");
    	
        if (e instanceof UsernameNotFoundException || e instanceof BadCredentialsException) {
            msg="用户名或密码输入错误，登录失败!";
        } else if (e instanceof DisabledException) {
            msg=e.getMessage();
        } else {
            msg="登录失败!";
        }
        baseResult = new BaseResult(400, msg);
        httpServletResponse.getWriter().write(objectMapper.writeValueAsString(baseResult));
    }
}
