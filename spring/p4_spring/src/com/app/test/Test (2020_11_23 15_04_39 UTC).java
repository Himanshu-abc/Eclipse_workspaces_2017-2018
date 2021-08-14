package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.entity.Restaurant;

public class Test {
	
	public static void main(String [] args) {
	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring_config.xml");
		
		Restaurant rt=(Restaurant) ctx.getBean("r");
		
		rt.tea();
	}
}
