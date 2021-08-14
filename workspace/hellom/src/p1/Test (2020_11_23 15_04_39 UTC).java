package p1;
import p1.Hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[]args){
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		Hello ob1=(Hello)ctx.getBean("h1");
		System.out.println(ob1);
		Hello ob2=(Hello)ctx.getBean("h2");
		System.out.println(ob2);
		Hello ob3=ctx.getBean(Hello.class);
		System.out.println(ob3);
		
		System.out.println(ob1.getMessage());
		System.out.println(ob2.getMessage());
		System.out.println(ob3.getMessage());
	}

}
