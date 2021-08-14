package com.annotation.aw;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class X {
	
@Resource(name="a1")
private A a;

@Autowired
private B b;

public X(){
	
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
	System.out.println(a);
	System.out.println(b);	
}
}
