package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		
		Message obj=(Message) ctx.getBean("b2");
		
		obj.showMessage();
	}

}
