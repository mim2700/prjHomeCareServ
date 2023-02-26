/**
 * 
 */
package com.home.care.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author bhabesh
 *
 */
@Component
public class WebMvcConfig implements WebMvcConfigurer{
	@Autowired
	AuthorizationInterceptor authorizationInterceptor;
	/**
	 * 
	 */
	public WebMvcConfig(AuthorizationInterceptor authorizationInterceptor) {
		this.authorizationInterceptor = authorizationInterceptor;
	}
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		//WebMvcConfigurer.super.addInterceptors(registry);
		registry.addInterceptor(authorizationInterceptor)
				.addPathPatterns("/api/user");
	}
	
	
}
