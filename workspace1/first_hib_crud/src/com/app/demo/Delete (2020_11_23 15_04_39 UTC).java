package com.app.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		
	Configuration cfg=new Configuration().configure();
	
	SessionFactory sf=cfg.buildSessionFactory();
	
	Session session=sf.openSession();
	
	session.beginTransaction();
	
	System.out.println("Enter the id  you want to delete");
	Scanner sc=new Scanner(System.in);
    int id=sc.nextInt();
	
	Product p=(Product) session.load(Product.class,id);
	
	session.delete(p);
	
	session.getTransaction().commit();
	
	System.out.println("done");
	
	session.close();
	sf.close();
	}
}
