package com.demo.s_t_m3_autowired_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext  context=new ClassPathXmlApplicationContext("bean.xml");
       
       Tyre t=(Tyre) context.getBean("tyre");
       t.setBrand("MRF");
       
       Vehicle obj=(Vehicle) context.getBean("car");
       obj.drive();
    }
}
