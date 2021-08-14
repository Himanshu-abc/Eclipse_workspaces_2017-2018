package com.bean.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages="com.bean.controller")
@EnableWebMvc
public class SpringConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");
		
		return vr;
	}
}
