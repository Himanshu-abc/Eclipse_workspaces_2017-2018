package com.app.entity;

public class Hello implements Message {

	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void showMessage() {
		System.out.println(message);
	}
}
