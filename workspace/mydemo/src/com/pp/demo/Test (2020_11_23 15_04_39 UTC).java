package com.pp.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
	SessionFactory sf=	cfg.buildSessionFactory();
	Session session=sf.openSession();
	Product p=new Product();
	p.setPid(103);
	p.setName("bolts");
	p.setPrice(22);
	p.setQty(12);
	Transaction tx=session.beginTransaction();
	session.save(p);
	tx.commit();
	session.close();
	sf.close();
	System.out.println("Done");
	}

}
