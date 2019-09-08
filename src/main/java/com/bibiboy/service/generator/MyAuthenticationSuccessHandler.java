package com.bibiboy.service.generator;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import com.bibiboy.bean.entity.BaseResult;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * security登录成功handler
* <p>Title: MyAuthenticationSuccessHandler</p>  
* @author 哔哔小子
* @date 2019年1月2日
 */
@Component("myAuthenticationSuccessHandler")
public class MyAuthenticationSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler{
    
	/**
	 * 过期时间 2小时
	 */
    //static final long EXPIRATIONTIME = 1000 * 60 * 60 * 2;
	static final long EXPIRATIONTIME = 1000 * 60 * 5;
    /**
     * JWT 密码
     */
    static final String SECRET = "test";
    /**
     * TOKEN前缀
     */
    static final String TOKEN_PREFIX = "Bearer ";
    /**
     * 存放Token的Header Key
     */
    static final String HEADER_STRING = "token";

    /**
     * 自定义的 playload
     */
    static final String AUTHORITIES = "authorities";
	
	@Autowired
    private ObjectMapper objectMapper;
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException {
    	
    	//什么都不做的话，那就直接调用父类的方法
        //super.onAuthenticationSuccess(request, response, authentication);
    	
    	//生成 jwt,Claims claims = (Claims) Jwts.claims().put("aName", "aValue")
        String jwt = Jwts.builder()
                //这里只把用户的不重要信息放到token中，因为token在前段比较危险不能存比较重要的信息
                //.claim(AUTHORITIES, authentication)
                .setSubject(authentication.getName())
                //.setClaims(claims)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
    	
        
    	Cookie token=new Cookie("token", "XCoder Studio");
    	token.setComment("securtiy"); // Cookie描述
    	token.setMaxAge((int)EXPIRATIONTIME);	//有效时间
    	token.setPath("/");
    	response.setCharacterEncoding("UTF-8");
    	token.setValue(jwt);
    	//把token设置到Cookie中去
        response.addCookie(token);
        
        //这里可以根据实际情况，来确定是跳转到页面或者json格式。
        //如果是返回json格式，那么我们这么写
        BaseResult baseResult = new BaseResult(200, "登陆成功");
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().write(objectMapper.writeValueAsString(baseResult));

        //如果是要跳转到某个页面的，比如我们的那个whoim的则
        //new DefaultRedirectStrategy().sendRedirect(request, response, "/home.html");

    } 
    
}
