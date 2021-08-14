package com.demo.s_t_m4_annotation_based_configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.demo.s_t_m4_annotation_based_configuration")
public class Spring_Config {
	
	/*@Bean
	public Nexus getPhone() {
		return new Nexus();
	}
	
	@Bean
	public MobileProcessor getProcessor() {
		return new Snapdragon();
	}*/

}
