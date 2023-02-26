/**
 * 
 */
package com.home.care.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author bhabesh
 *
 */
@Component
public class AuthorizationInterceptor implements HandlerInterceptor {

	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		String authorizationHeader = request.getHeader("authorization");
		request.setAttribute("token", authorizationHeader);
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}

}
