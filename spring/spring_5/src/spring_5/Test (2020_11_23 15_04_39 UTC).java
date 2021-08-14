package spring_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		Person p=(Person) context.getBean("personBean");
		
		p.show();
	}
}
