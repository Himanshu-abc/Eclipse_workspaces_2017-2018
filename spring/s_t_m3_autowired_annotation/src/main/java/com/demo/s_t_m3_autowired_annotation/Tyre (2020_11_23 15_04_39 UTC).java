package com.demo.s_t_m3_autowired_annotation;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	
	private String brand;

	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
}
