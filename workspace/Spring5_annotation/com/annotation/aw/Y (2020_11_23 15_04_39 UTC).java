package com.annotation.aw;

import org.springframework.beans.factory.annotation.Autowired;

public class Y {
	private A a;

	private B b;
	public Y(){}
	@Autowired(required=false)
	public Y(A a, B b) {
		this.a = a;
		this.b = b;
	}
	
	public void show(){
		System.out.println(a);
		System.out.println(b);	
	}
}
