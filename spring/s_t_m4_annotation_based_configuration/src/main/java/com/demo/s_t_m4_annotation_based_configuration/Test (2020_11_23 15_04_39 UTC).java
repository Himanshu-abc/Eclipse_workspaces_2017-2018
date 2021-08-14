package com.demo.s_t_m4_annotation_based_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new AnnotationConfigApplicationContext(Spring_Config.class);
       
       Nexus n=context.getBean(Nexus.class);
       
       n.config();
    }
}
