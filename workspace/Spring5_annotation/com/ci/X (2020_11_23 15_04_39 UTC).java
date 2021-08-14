package com.ci;

public class X {
private A a;
private B b;

public X(A a, B b) {
	super();
	this.a = a;
	this.b = b;
}

public A getA() {
	return a;
}
public void setA(A a) {
	this.a = a;
}
public B getB() {
	return b;
}
public void setB(B b) {
	this.b = b;
}


public void show(){
	System.out.println("a="+a);
	System.out.println("b="+b);
}
}
