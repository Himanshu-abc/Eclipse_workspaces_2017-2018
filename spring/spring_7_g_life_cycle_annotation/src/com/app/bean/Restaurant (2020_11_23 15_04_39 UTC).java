package com.app.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Restaurant {
	
	public void greet() {
		System.out.println("welcome to our restaurant....");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("this is initaialization method.....");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("this is destroy method.....");
	}
}
