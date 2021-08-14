package com.app.entity;

public class Restaurant {
	
	private Itea it;
	
	public Restaurant(Itea it) {
		this.it=it;
	}
	
	public void tea() {
		it.makeTea();
	}

}
