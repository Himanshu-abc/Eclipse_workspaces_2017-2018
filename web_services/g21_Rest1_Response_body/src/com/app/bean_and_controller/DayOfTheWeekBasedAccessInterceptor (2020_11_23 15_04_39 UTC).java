package com.app.bean_and_controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfTheWeekBasedAccessInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		Calendar cal=Calendar.getInstance();
		
	    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	    
	    if(dayOfWeek == 1 ) {
	    	
	    	response.getWriter().write("The website is closed om sunday please try to accesss"
	    			+ " it on any other day !!");
	    	
	    	return false;
	    }
	    return true;	
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("HandlerInterceptorAdaptor : this is postHandle method "+
		request.getRequestURI().toString());
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
		System.out.println("HandlerInterceptorAdaptor : this is afterCompletion method "+
		request.getRequestURI().toString());
	}
	
}
