package com.app.bean;

public class Restaurant {
	
	private String note;

	public void setNote(String note) {
		this.note = note;
	}
	
	public void greetCustomer() {
		System.out.println(note);
	}

}
