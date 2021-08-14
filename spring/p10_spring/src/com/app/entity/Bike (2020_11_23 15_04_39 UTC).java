package com.app.entity;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

	@Override
	public void drive() {
		System.out.println("we are riding a bike");
	}	
}