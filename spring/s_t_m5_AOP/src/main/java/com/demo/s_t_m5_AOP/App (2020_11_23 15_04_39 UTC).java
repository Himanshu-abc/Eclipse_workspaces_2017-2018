package com.demo.s_t_m5_AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        
        Alien a=context.getBean(Alien.class);
        
        a.show();
    }
}
