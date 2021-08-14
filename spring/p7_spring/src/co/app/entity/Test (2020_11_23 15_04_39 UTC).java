package co.app.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring_config.xml");
		
		Restaurant r=(Restaurant) ac.getBean("rs");
		System.out.println(r);
	}
}
