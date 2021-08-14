package com.app.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Create {

	public static <T> void print(T t) {
		System.out.println(t);
	}
	
	public static <T> void print() {
		//next line
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Product p=new Product();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("enter product id");  
		int id=sc.nextInt();
		
	    System.out.print("enter product name");
	    String name=sc.next();
	    
	    System.out.print("enter product price");
	    double price =sc.nextDouble();
	    
	    System.out.print("enter product quantity");
	    int qty =sc.nextInt();
		
		p.setId(id);
		p.setName(name);
		p.setPrice(price);
		p.setQty(qty);
		
		Transaction tx=s.beginTransaction();
		
		s.save(p);
		/*s.persist(p);*/
		
	    tx.commit();
	    s.close();
	    sf.close();
	    
	    System.out.println("data saved successfully");
	    
	}
}
