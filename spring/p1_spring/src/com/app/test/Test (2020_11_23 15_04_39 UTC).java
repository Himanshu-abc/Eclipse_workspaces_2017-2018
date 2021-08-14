package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.entity.Message;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		
		Message m=(Message) ctx.getBean("m1");
		
		System.out.println(m.getMessage());
		
		Message me=(Message) ctx.getBean("m2");
		
		System.out.println(me.getMessage());
	}
}
