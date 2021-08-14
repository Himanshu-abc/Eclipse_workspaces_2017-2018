package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.product.Product;

public class TestSave {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Product p=new Product();
		p.setId(2);
		p.setName("nut-bolt");
		p.setPrice(99.00);
		p.setBrand("xyz");
		
		Transaction tx=s.beginTransaction();
		s.save(p);
		tx.commit();
		
		s.close();
		sf.close();
		System.out.println("done");
	}
}
