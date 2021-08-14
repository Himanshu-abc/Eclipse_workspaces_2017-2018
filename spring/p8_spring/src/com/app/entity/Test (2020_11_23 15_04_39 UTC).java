package com.app.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		
		School s=(School) ac.getBean("school");
		s.setName("smps");
		s.setCode(2001);
		s.setStudents(500);
		
		System.out.println(s);
	}
}
