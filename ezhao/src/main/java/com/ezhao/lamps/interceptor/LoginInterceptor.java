package com.ezhao.lamps.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


public class LoginInterceptor implements HandlerInterceptor {
	private static Logger logger = Logger.getLogger(LoginInterceptor.class);
	public static final String SESSION_LOGIN_TOKEN = "LOGINTOKEN";
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		String contextPath = request.getContextPath();
		try{
			HttpSession session = request.getSession();
			String loginName = (String)session.getAttribute(SESSION_LOGIN_TOKEN);
			if(StringUtils.isBlank(loginName) == false){
				return true;
			}
		}catch(Exception e){
			logger.error("get the login name error : ",e);
		}
		String url = request.getRequestURI();
		if(url.equals("/ezhao/admin/home")){
			response.sendRedirect(contextPath + "/login/home");
		}else{
			response.getWriter().print("{\"statusCode\":\"301\"}");
		}
		return false;
	}

	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	}

}
