package p2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		A a=(A) ctx.getBean("a");
		
		a.show();
	}
}
