package com.life.demo;

public class A {

	String msg;

	
	public A(){
		System.out.println("Class A Default/No Arg Constructor");
	}
	
	public A(String msg) {
		this.msg = msg;
		System.out.println("Class A One Arg Constructor");

	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	void startUp(){
		System.out.println("init method executed...");
	}
	void cleanUp(){
		System.out.println("destroy method executed...");
	}
	
	
}
