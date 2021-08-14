package com.demo.s_t_m5_AOP;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Component
@org.aspectj.lang.annotation.Aspect
public class Aspect {
	
	@Before("execution(public void show())")
	public void log() {
		
	System.out.println("logging method seprate non-buisness logic from main logic");	
	}
}
