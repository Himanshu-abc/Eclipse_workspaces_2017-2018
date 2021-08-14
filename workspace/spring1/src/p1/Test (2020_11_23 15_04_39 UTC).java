package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ctx= new ClassPathXmlApplicationContext("Beans.xml");
		
		Message m=ctx.getBean(Message.class);
		m.showMessage();

	}

}
