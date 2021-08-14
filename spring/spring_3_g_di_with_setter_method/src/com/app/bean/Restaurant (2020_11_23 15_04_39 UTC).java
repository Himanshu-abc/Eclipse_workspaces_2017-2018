package com.app.bean;

public class Restaurant {
	
	private IhotDrink ihd;

	public void setIhd(IhotDrink ihd) {
		this.ihd = ihd;
	}

	public void prepareTea() {
		ihd.prepareHotDrink();
	}

}
