package com.demo.s_t_m2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
       
       Vehicle obj=(Vehicle) context.getBean("bike");
       
       obj.drive();
    }
}
