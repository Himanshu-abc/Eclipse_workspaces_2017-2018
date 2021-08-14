package com.app.test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;	
import org.hibernate.classic.Session;

import com.app.product.Product;

public class TestUpdate {

	public static void main(String[] args) {
	
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Product p=new Product();
		
		p.setId(2);
		p.setName("clippers");
		p.setBrand("mahindra");
		p.setPrice(99.99);
		
		s.beginTransaction();
		s.saveOrUpdate(p);
		s.getTransaction().commit();
		s.close();
		sf.close();
		System.out.println("done");
	}	
}
