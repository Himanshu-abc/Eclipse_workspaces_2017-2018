package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.product.Product;

public class TestDelete {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Product p=(Product) s.get(Product.class,2);
		s.beginTransaction();
		s.delete(p);
		s.getTransaction().commit();
		
		s.close();
		sf.close();
		
		System.out.println("done");
	}
}
