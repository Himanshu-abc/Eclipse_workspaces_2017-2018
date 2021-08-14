package com.app.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		
		Tyre t=(Tyre) ac.getBean("tyre");
		t.setBrand("MRF");
		
		Car c=(Car) ac.getBean("car");
		c.drive();
	}
}
