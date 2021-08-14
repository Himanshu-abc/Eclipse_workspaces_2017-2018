package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		Hello obj=(Hello) context.getBean("b1");
		
		System.out.println(obj);
		
		System.out.println(obj.getMessage());
		
		Hello obj2=(Hello) context.getBean("b2");
		
		System.out.println(obj2);
		
		System.out.println(obj2.getMessage());
	}
}