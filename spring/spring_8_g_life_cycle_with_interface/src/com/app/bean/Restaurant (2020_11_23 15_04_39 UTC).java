package com.app.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Restaurant implements InitializingBean,DisposableBean{
	
	public void greetCustomer() {
		
		System.out.println("welecome to restaurant customer.....");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("we are in afterPropertiesSet Method");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("we are in destroy method");
	}

}
