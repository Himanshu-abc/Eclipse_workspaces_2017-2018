package com.app.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BMW {

	@Qualifier("car")
	@Autowired
	private Vehicle v;

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}
	
	public void config() {
		System.out.println("it's a fast car");
		v.drive();
	}
}
