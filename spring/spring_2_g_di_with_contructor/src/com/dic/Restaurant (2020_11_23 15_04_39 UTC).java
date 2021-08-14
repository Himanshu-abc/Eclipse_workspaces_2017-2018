package com.dic;

public class Restaurant {
	
	private IhotDrink ihd;
	
	public Restaurant(IhotDrink ihd) {
		this.ihd=ihd;
	}
	
	public void prepareTea() {
		ihd.prepareHotDrink();
	}
}
