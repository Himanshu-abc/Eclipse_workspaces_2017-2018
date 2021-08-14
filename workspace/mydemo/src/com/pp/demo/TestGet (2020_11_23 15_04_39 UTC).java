package com.pp.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestGet {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
	SessionFactory sf=	cfg.buildSessionFactory();
	Session session=sf.openSession();
	Product p=(Product)session.get(Product.class,103);
	System.out.println(p);
	session.close();
	sf.close();
	System.out.println("Done");
	}

}
