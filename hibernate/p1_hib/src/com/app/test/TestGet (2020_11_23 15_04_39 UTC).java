package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.product.Product;

public class TestGet {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
	
		Product p=(Product) s.get(Product.class,1);
		
		System.out.println(p.getId());
		System.out.println(p.getName());
		System.out.println(p.getPrice());
		System.out.println(p.getBrand());
		
		s.close();
		sf.close();
		
	}
}
