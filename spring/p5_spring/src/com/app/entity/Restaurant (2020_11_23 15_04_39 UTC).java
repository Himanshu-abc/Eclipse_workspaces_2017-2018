package com.app.entity;

import java.util.Set;

public class Restaurant {
	
	private String name;
    private Set<String> foods;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<String> getFoods() {
		return foods;
	}
	public void setFoods(Set<String> foods) {
		this.foods = foods;
	}
	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", foods=" + foods + "]";
	}
}
