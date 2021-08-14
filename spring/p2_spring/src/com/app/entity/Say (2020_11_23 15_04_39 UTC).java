package com.app.entity;

public class Say implements Message {

	@Override
	public void showMessage() {
		System.out.println("this is a say messages");
	}
}
