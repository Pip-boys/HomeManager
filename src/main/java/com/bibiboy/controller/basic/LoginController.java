package com.bibiboy.controller.basic;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bibiboy.bean.equip.Item;

@Controller
public class LoginController {
    private Logger logger = LoggerFactory.getLogger(LoginController.class);
    
    //之前遇到的问题，无法跳转的原因是没有对/的处理，即使加了其他处理路径，也不会执行设置的处理路径而执行/
    //使用defualtSeccussUrl来定义成功路径,loginProcessingUrl来定义处理路径（不定义不行,之后会被临时重定向到defualtSeccussUrl）
    @RequestMapping("/")
    public String home() {
    	String name = SecurityContextHolder.getContext().getAuthentication().getName();
        logger.info("登陆用户：" + name);
        return "home";
    }
    
    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }
    
    @RequestMapping("/login/form")
    public String loginForm() {
    	String name = SecurityContextHolder.getContext().getAuthentication().getName();
        logger.info("登陆用户：" + name);
        return "home";
    }
    
    @RequestMapping("/login?logout")
    public String logout() {
        return "login";
    }
    
    @RequestMapping("/login/error")
    public String login_error(HttpServletRequest request, HttpServletResponse response)throws AuthenticationException{
    	response.setContentType("text/html;charset=utf-8");  
        return "login_error";
    }

    @RequestMapping("/admin")
    @ResponseBody
    @PreAuthorize("hasPermission('/admin','s')")
    public String printAdmin() {
        return "如果你看见这句话，说明你有ROLE_ADMIN角色，并且拥有S权利";
    }
    
    @RequestMapping("/admin2")
    @ResponseBody
    @PreAuthorize("hasPermission('/admin2','a')")
    public String printAdmin2() {
        return "如果你看见这句话，说明你有ROLE_ADMIN角色，并且拥有A权利";
    }

    @RequestMapping("/user")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_USER')")
    public String printUser() {
        return "如果你看见这句话，说明你有ROLE_USER角色";
    }
    
    @RequestMapping("/user2")
    @ResponseBody
    @PreAuthorize("hasRole('ROLE_USER2')")
    public String printUser2() {
        return "如果你看见这句话，说明你有ROLE_USER2角色";
    }
    
    @ResponseBody
    @RequestMapping(value="/test")
    public List<Item> test(){
    	Item item = new Item("颜色", "红色");
    	Item item2 = new Item("重量", "1Kg");
    	Item item3 = new Item("功率", "150w");
    	List<Item> list = new ArrayList<>();
    	list.add(item);list.add(item2);list.add(item3);
		return list;
    }

}