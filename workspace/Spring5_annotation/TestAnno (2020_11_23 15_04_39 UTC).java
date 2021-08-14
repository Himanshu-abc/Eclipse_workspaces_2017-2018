

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.annotation.aw.X;
import com.annotation.aw.Y;


public class TestAnno {
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	ApplicationContext ctx=new ClassPathXmlApplicationContext("beansAnno.xml");
	
	X x=ctx.getBean("x",X.class);
	x.show();
	
	System.out.println("--------------------");
	
	Y y=ctx.getBean(Y.class);
	y.show();
	}

}
