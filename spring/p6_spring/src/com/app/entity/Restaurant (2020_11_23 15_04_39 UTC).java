package com.app.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant implements InitializingBean,DisposableBean{
	
	public void message() {
		System.out.println("welcome to our restaurant");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("this is destry method");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("this is init_method");	
	}
}
