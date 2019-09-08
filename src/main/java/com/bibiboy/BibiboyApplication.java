package com.bibiboy;

package com.bibiboy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.bibiboy.controller.basic.VerifyServlet;

@SpringBootApplication
@EnableScheduling
@MapperScan({"com.bibiboy.mapper.basic","com.bibiboy.mapper.user","com.bibiboy.mapper.equip","com.bibiboy.mapper.order"})//扫描指定路径下的mapper，否则找不到mapper接口
public class BibiboyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BibiboyApplication.class, args);
    }

    /**
     * 注入验证码servlet
     */
    @Bean
    public ServletRegistrationBean indexServletRegistration() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new VerifyServlet());
        registration.addUrlMappings("/getVerifyCode");
        return registration;
    }

}
