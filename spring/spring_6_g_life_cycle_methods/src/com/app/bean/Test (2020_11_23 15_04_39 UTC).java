package com.app.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		((AbstractApplicationContext)context).registerShutdownHook();
		
		Restaurant obj=(Restaurant) context.getBean("restaurantBean");
		
		obj.greetCustomer();
	}
}
