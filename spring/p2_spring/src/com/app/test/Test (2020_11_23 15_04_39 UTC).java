package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.entity.Hello;
import com.app.entity.Say;

public class Test {
	
	public static void main(String [] args) {
	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		Hello he=(Hello) ctx.getBean("h");
		
		System.out.println(he.getMessage());
		
		Say st=(Say) ctx.getBean("s");
		
		st.showMessage();
	}
}