package com.bibiboy.config;

import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.expression.DefaultWebSecurityExpressionHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.rememberme.JdbcTokenRepositoryImpl;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.web.cors.CorsUtils;
import org.springframework.web.filter.HiddenHttpMethodFilter;

import com.bibiboy.filter.JWTAuthenticationFilter;
import com.bibiboy.service.generator.CustomLogoutSuccessHandler;
import com.bibiboy.service.generator.CustomPermissionEvaluator;
import com.bibiboy.service.generator.MyAuthenticationFailHander;
import com.bibiboy.service.generator.MyAuthenticationProvider;
import com.bibiboy.service.generator.MyAuthenticationSuccessHandler;
import com.bibiboy.service.generator.MyUserDetailsService;
import com.bibiboy.util.GeneralTool;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled=true)    //开启角色控制
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
    private DataSource dataSource;
	
	@Autowired
	private MyAuthenticationProvider authenticationProvider;
	
	@Autowired
	private MyUserDetailsService myUserDetailsService;
	
	@Autowired
	private MyAuthenticationFailHander myAuthenctiationFailureHandler;
	
	@Autowired
	private MyAuthenticationSuccessHandler myAuthenctiationSuccessHandler;
	
	@Autowired
	private AuthenticationDetailsSource<HttpServletRequest, WebAuthenticationDetails> authenticationDetailsSource;
	
	@Autowired
	private JWTAuthenticationFilter jWTAuthenticationFilter;
	
	@Autowired
	private CustomLogoutSuccessHandler customLogoutSuccessHandler;
	
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	
    	http.authorizeRequests()
    	.antMatchers("/css/**", "/js/**", "/images/**","/login.html","/druid/**","/getVerifyCode").permitAll()
        // 如果有允许匿名的url，填在下面
        //.antMatchers("/getVerifyCode").permitAll()
        .anyRequest().authenticated()
        .and()
		.formLogin().loginPage("/login")
		/*.defaultSuccessUrl("/login/form")*/
		.loginProcessingUrl("/login/form")/*.failureUrl("/login-error")*/.permitAll()
		.successHandler(myAuthenctiationSuccessHandler)
		.failureHandler(myAuthenctiationFailureHandler)//表单登录，permitAll()表示这个不需要验证 登录页面，登录失败页面
		.authenticationDetailsSource(authenticationDetailsSource)//注入Details源对象,即额外提供消息信息，比如验证码
		.and()
		.logout().logoutUrl("/logout").logoutSuccessHandler(customLogoutSuccessHandler).permitAll().and()
		.authorizeRequests().anyRequest().authenticated();
    	
		//跨域请求的设置,处理跨域请求中的Preflight请求
		http.cors().and().csrf().disable().authorizeRequests()
        .requestMatchers(CorsUtils::isPreFlightRequest).permitAll();

		http.authenticationProvider(authenticationProvider);
		
		http.addFilterBefore(jWTAuthenticationFilter, UsernamePasswordAuthenticationFilter.class); // JWT Filter
		
		//记住我
		http.rememberMe()
		.tokenRepository(persistentTokenRepository())	//调用TokenRepositor去获取数据库中的token
		// 有效时间：单位s
		.tokenValiditySeconds(60*60)
		.userDetailsService(myUserDetailsService);
		
		
    }

    /**
     * 要有一个默认的编码器,这也是对密码进行处理的地方，也会调用UserDetailsService
     * @param auth
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	
    	auth.authenticationProvider(authenticationProvider);
    	
        auth.userDetailsService(myUserDetailsService).passwordEncoder(new PasswordEncoder() {
            @Override
            public String encode(CharSequence charSequence) {
                return GeneralTool.md5Encode((String)charSequence);
            }

            @Override
            public boolean matches(CharSequence charSequence, String s) {
                return s.equals(GeneralTool.md5Encode((String)charSequence));
            }
        });
        //设置提供校验对象适配器
        auth.authenticationProvider(authenticationProvider);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**", "/js/**", "/images/**","/login.html","/druid/**");
    }
    
    //记住我功能的Token注册对象
    @Bean
    public PersistentTokenRepository persistentTokenRepository(){
        JdbcTokenRepositoryImpl tokenRepository = new JdbcTokenRepositoryImpl();
        tokenRepository.setDataSource(dataSource);
        // 如果token表不存在，使用下面语句可以初始化该表；若存在，会报错。
        //tokenRepository.setCreateTableOnStartup(true);
        return tokenRepository;
    }
    
    //注入自定义的权限校验对象
    @Bean
    public DefaultWebSecurityExpressionHandler webSecurityExpressionHandler(){
        DefaultWebSecurityExpressionHandler handler = new DefaultWebSecurityExpressionHandler();
        //替换
        handler.setPermissionEvaluator(new CustomPermissionEvaluator());
        return handler;
    }
    
    /**
     * Hidden过滤器
     * <p>Title: myFilterRegistrationBean</p>  
     * <p>Description: </p>  
     * @return
     */
    @Bean
    public FilterRegistrationBean<HiddenHttpMethodFilter> myFilterRegistrationBean() {
        FilterRegistrationBean<HiddenHttpMethodFilter> registration = new FilterRegistrationBean<HiddenHttpMethodFilter>();
        registration.setFilter(new HiddenHttpMethodFilter());//添加过滤器
        registration.addUrlPatterns("/*");//设置过滤路径，/*所有路径
        registration.setName("HiddenHttpMethodFilter");//设置优先级
        registration.setOrder(2);//设置优先级
        return registration;
    }
    
}
