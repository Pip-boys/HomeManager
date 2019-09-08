package com.bibiboy.service.generator;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSONObject;

/**
 * 自定义退出管理器
* <p>Title: CustomLogoutSuccessHandler</p>  
* @author 哔哔小子
* @date 2019年2月18日
 */
@Component
public class CustomLogoutSuccessHandler implements LogoutSuccessHandler {
	
	Logger logger = LoggerFactory.getLogger(CustomLogoutSuccessHandler.class);
	
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.setContentType("text/html;charset=UTF-8");
        
        Cookie[] cookies = request.getCookies();
    	if (cookies.length>0) {
    		for (Cookie cookie : cookies) {
    			if (cookie.getName().equals("token")) {
    				cookie.setMaxAge(0);
    				cookie.setPath("/");
    				response.addCookie(cookie);
    			}
    		}
		}
    	logger.info("用户:"+authentication.getName()+"已退出登录");
    	response.sendRedirect("login.html");
    }
}