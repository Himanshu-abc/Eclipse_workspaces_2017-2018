import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.life.demo.A;

public class LifeDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("bean-life.xml");
		A a=ctx.getBean(A.class);
		System.out.println(a.getMsg());
		ctx.close();
	}

}
