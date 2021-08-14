package com.demo.first_m;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext ac =new ClassPathXmlApplicationContext("bean.xml");
	
	Vehicle obj = (Vehicle) ac.getBean("bikeBean");
	
	obj.drive();
	}
}
