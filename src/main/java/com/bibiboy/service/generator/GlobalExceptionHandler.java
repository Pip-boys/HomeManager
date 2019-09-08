package com.bibiboy.service.generator;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.validation.BindException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.UnsatisfiedServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bibiboy.bean.entity.BaseResult;
import com.bibiboy.util.GeneralTool;
import com.google.zxing.NotFoundException;

/**
 * 中央异常处理器
 * //@ControllerAdvice的Controller是@Compoent,Advice是@ExceptionHandler、@InitBinder和@ModelAttribute
 * Compoent表示该类会被自动注入到IOC了且完成初始化，可以直接使用
 * Advice实际上是一个AOP类型的注解，加了ExcepitonHandler的方法实际上就是一个切面，切点就是会抛出value类型异常的方法，执行方法大概是After？
 * InitBinder平时不用，是给实现了ReuquestMapping的方法做切面的，在传入参数时对特殊数据进行转换，比如2018-01-01转成Date，被ReuqestParam默认使用
 * ModelAttribute是用于获取加了这个注解的方法名称的，也被ReuqestParam默认使用
 */
@ControllerAdvice	
@Order(2)
public class GlobalExceptionHandler {

    Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = DuplicateKeyException.class)
    @ResponseBody
    public BaseResult DuplicateKeyExceptionHandler(HttpServletRequest request, Exception e) throws Exception {
    	String message = e.getMessage();
    	int start = message.indexOf("entry ", 114);
    	int end = message.indexOf(" for", 114);
    	String temp = message.substring(start+6, end);
    	start = temp.indexOf("'");
    	end = temp.lastIndexOf("'");
    	String error = temp.substring(start+1, end);
        logger.error("发生了DuplicateKeyException的异常,"+GeneralTool.checkStringExceptionCatelog(error)+error+"已经存在！");
        //e.printStackTrace();
        return new BaseResult(400, GeneralTool.checkStringExceptionCatelog(error)+error+"已经存在！");
    }
    
    @ExceptionHandler(value = IOException.class)
    @ResponseBody
    public BaseResult IOExceptionHandler(HttpServletRequest request, Exception e) throws Exception {
        logger.error("发生了IOException的异常");
        e.printStackTrace();
        return new BaseResult(400, "数据传输异常");
    }
      
    @ExceptionHandler(value = IllegalStateException.class)
    @ResponseBody
    public BaseResult IllegalStateExceptionHandler(HttpServletRequest request, Exception e) throws Exception {
        logger.error("发生了IllegalStateException的异常");
        e.printStackTrace();
        return new BaseResult(400, "参数错误");
    }
    
    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public BaseResult BindExceptionHandler(HttpServletRequest request, Exception e) throws Exception {
        logger.error("发生了BindException的异常");
        e.printStackTrace();
        return new BaseResult(400, "缺少必须参数");
    }
    
    @ExceptionHandler(value = UnsatisfiedServletRequestParameterException.class)
    @ResponseBody
    public BaseResult UnsatisfiedServletRequestParameterExceptionExceptionHandler(HttpServletRequest request, Exception e) throws Exception {
        logger.error("发生了UnsatisfiedServletRequestParameterException的异常");
        e.printStackTrace();
        return new BaseResult(400, "请求缺少必须参数");
    }
    
    @ExceptionHandler(value = HttpMediaTypeNotSupportedException.class)
    @ResponseBody
    public BaseResult HttpMediaTypeNotSupportedExceptionHandler(HttpServletRequest request, Exception e) throws Exception {
        logger.error("发生了HttpMediaTypeNotSupportedException的异常");
        e.printStackTrace();
        return new BaseResult(400, "http请求类型不支持！");
    }
    
    
    @ExceptionHandler(value = AccessDeniedException.class)
    @ResponseBody
    public BaseResult AccessDeniedExceptionHandler(HttpServletRequest request, Exception e) throws Exception {
        logger.error("发生了AccessDeniedException的异常");
        e.printStackTrace();
        //return new BaseResult(400, e.getMessage());
        return new BaseResult(400, "未拥有此权限");
    }
    
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public BaseResult RuntimeExceptionHandler(HttpServletRequest request, Exception e) throws Exception {
        logger.error("发生了RuntimeException的异常");
        e.printStackTrace();
        //return new BaseResult(400, e.getMessage());
        return new BaseResult(400, "请求失败，请联系管理员");
    }
    
    @ExceptionHandler(value = DataIntegrityViolationException.class)
    @ResponseBody
    public BaseResult DataIntegrityViolationExceptionHandler(HttpServletRequest request, Exception e) throws Exception {
        logger.error("发生了DataIntegrityViolationException的异常");
        e.printStackTrace();
        return new BaseResult(400, "请求失败，请联系管理员");
    }
    
    @ExceptionHandler(value = NotFoundException.class)
    @ResponseBody
    public BaseResult EqcordNotFoundExceptionHandler(HttpServletRequest request, Exception e) throws Exception {
        logger.error("未检测查二维码");
        e.printStackTrace();
        return new BaseResult(400, "file");
    }
    
    
    //value根据捕捉的异常
    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultErrorHandler(HttpServletRequest request, Exception e) throws Exception {
    	e.printStackTrace();
        ModelAndView view = new ModelAndView();
        view.addObject("exception", e);
        StringBuffer url = request.getRequestURL();
        String root = GeneralTool.subStringIndexOfStr(url.toString(), "/", 4);
        view.addObject("urk", "http://localhost:8080/pages/error/500.html");
        view.setViewName("errorPage");
        logger.error("发生了Exception的异常");
        return view;
    }
    
}
