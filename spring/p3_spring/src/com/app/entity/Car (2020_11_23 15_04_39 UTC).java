package com.app.entity;

public class Car {
	
	private String model;
	private String color;
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + "]";
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
