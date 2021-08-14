import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p2.A;
import p2.X;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext ctx= new ClassPathXmlApplicationContext("beans1.xml");
		A a=ctx.getBean(A.class);
		System.out.println(a);
		X x=ctx.getBean(X.class);
		System.out.println(x);
		
	}

}
