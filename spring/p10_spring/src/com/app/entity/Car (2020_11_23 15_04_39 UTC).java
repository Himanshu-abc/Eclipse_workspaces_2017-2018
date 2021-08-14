package com.app.entity;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

	@Override
	public void drive() {
		System.out.println("we are driving a car");
	}
}
