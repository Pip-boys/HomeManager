package com.bibiboy.filter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.security.authentication.AccountExpiredException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.bibiboy.bean.basic.SysRole;
import com.bibiboy.bean.basic.SysUser;
import com.bibiboy.service.generator.MyUserDetailsService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;

/**
 * token校验
* <p>Title: JWTAuthenticationFilter</p>  
* @author 哔哔小子
* @date 2019年1月14日
 */
@Component
public class JWTAuthenticationFilter extends OncePerRequestFilter  {
	
	@Autowired
	private MyUserDetailsService userDetailsService;
	
	static final String AUTHORITIES = "authorities";

	@Autowired
    private ObjectMapper objectMapper;
	
	@Autowired
    RedisTemplate redisTemplate;
	
    /**
     * 在此方法中检验客户端请求头中的token,
     * 如果存在并合法,就把token中的信息封装到 Authentication 类型的对象中,
     * 最后使用  SecurityContextHolder.getContext().setAuthentication(authentication); 改变或删除当前已经验证的 pricipal
     *
     * @param request
     * @param response
     * @param chain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
    	//response.setHeader("Access-Control-Allow-Credentials", "true");
    	Cookie[] cookies = request.getCookies();
    	if (cookies==null) {
    		chain.doFilter(request, response);
            return;
		}
    	response.setCharacterEncoding("UTF-8");
    	for (Cookie cookie : cookies) {
			if (cookie.getName().equals("token")) {
				String token=cookie.getValue();
				UserDetails userDetails = getAuthentication(token,cookie,response);
				//如果有token，但是过期了或者用户名是空的，就直接告诉抛异常不用往下验证了
				if (userDetails!=null) {
					UsernamePasswordAuthenticationToken authentication =new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
	                authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
	                SecurityContextHolder.getContext().setAuthentication(authentication);
				}
			}
		}
    	//放行
        chain.doFilter(request, response);
    }

    /**
     * 解析token中的信息,并判断是否过期
     * @throws IOException 
     * @throws JsonProcessingException 
     */
    private UserDetails getAuthentication(String token,Cookie cookie,HttpServletResponse response) throws JsonProcessingException, IOException {
    	Claims claims=null;
        try {
        	claims = Jwts.parser().setSigningKey("test").parseClaimsJws(token).getBody();
		} catch (Exception e) {
			cookie.setMaxAge(0);
			cookie.setPath("/");
			response.addCookie(cookie);
			return null;
		}
        //得到用户名
        String username = claims.getSubject();
        //得到过期时间
        Date expiration = claims.getExpiration();
        //判断是否过期
        Date now = new Date();
        if (now.getTime() > expiration.getTime()) {
            throw new AccountExpiredException("该账号已过期,请重新登陆");
        }
        if (username != null) {
        	Optional<Map<String, Object>> optional = Optional.ofNullable((Map<String, Object>)redisTemplate.opsForHash().get(username, username));
        	if (optional.isPresent()) {
        		Map<String, Object> map = optional.get();
        		SysUser sysUser=(SysUser) map.get("sysUser");
        		List<SysRole> userRoleList=(List<SysRole>) map.get("userRoleList");
        		Collection<GrantedAuthority> authorities=authorities=new ArrayList<>();
                for (SysRole role : userRoleList) {
                    authorities.add(new SimpleGrantedAuthority(role.getVcSecurityName()));
                } 
				return new User(sysUser.getVcUserName(), sysUser.getVcPassWord(), true, true, true, true, authorities);
			}
        	return userDetailsService.loadUserByUsername(username);
        }
        return null;
    }


}