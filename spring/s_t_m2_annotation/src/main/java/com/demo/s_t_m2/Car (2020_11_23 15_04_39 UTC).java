package com.demo.s_t_m2;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	public void drive() {
	
		System.out.println("we are driving a car");
	}
}
