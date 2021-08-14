package com.app.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session sess=sf.openSession();
		
		sess.beginTransaction();
		
        Scanner sc=new Scanner(System.in);
        
        Product p=new Product();
        
        System.out.println("enter the id you want to update for");
        int id =sc.nextInt();
        p.setId(id);
		
	    System.out.print("enter product name");
	    String name=sc.next();
	    p.setName(name);
	    
	    System.out.print("enter product price");
	    double price =sc.nextDouble();
	    p.setPrice(price);
	    
	    System.out.print("enter product quantity");
	    int qty =sc.nextInt();
		p.setQty(qty);
		
		// to create   object if it does not exist
		/*sess.saveOrUpdate(p);*/
		
		sess.update(p);
		sess.getTransaction().commit();
		
		
		System.out.println("new values");
		Product pr=(Product) sess.get(Product.class,id);
        System.out.println(pr);
        
        sc.close();
        sess.close();
        sf.close();
        
        System.out.println("done");
	}
}
