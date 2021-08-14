package com.app.entity;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		Restaurant rr=(Restaurant) ctx.getBean("r");
		
		rr.setName("gurukripa");
		Set<String> set=new HashSet<>();
		set.add("raita");
		set.add("dal-bati");
		set.add("puri");
		
		rr.setFoods(set);
		
		System.out.println(rr);
		System.out.println("hash code "+rr.hashCode());
		
		Restaurant rr1=(Restaurant) ctx.getBean("r");
		
		System.out.println(rr1);
		System.out.println("hash_code "+rr1.hashCode());
	}
}
