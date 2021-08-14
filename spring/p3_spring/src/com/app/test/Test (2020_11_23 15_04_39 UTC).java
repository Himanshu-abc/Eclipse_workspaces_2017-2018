package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.entity.Person;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		Person p=(Person) ctx.getBean("per");
		
		System.out.println(p);
	}
}
