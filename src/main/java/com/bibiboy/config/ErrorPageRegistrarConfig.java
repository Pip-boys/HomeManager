package com.bibiboy.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.ErrorPageRegistrar;
import org.springframework.boot.web.server.ErrorPageRegistry;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * 错误页面配置
* <p>Title: ErrorPageRegistrarConfig</p>  
* @author 哔哔小子
* @date 2019年1月8日
 */
@Component
@Order(1)
public class ErrorPageRegistrarConfig implements ErrorPageRegistrar {

    //Springboot3.0已经不用EmddbedCustomer了，3.0版本以后推荐使用下面这种方式，这种方式在tomcat启动时根据错误码把相应的错误页面加载到注册对象上，默认路径是和静态页面的路径一样
    @Override
    public void registerErrorPages(ErrorPageRegistry registry) {
        ErrorPage[] errorPages = new ErrorPage[]{
                new ErrorPage(HttpStatus.NOT_FOUND, "/pages/error/404.html"),
                new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/pages/500.html"),
                new ErrorPage(Throwable.class, "/500.html")
        };
        registry.addErrorPages(errorPages);
    }
}
