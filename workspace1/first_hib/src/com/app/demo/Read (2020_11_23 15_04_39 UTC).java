package com.app.demo;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Read {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration().configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		System.out.println("Enter the id : ");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		
		Product p=new Product();
		
		p = (Product) session.get(Product.class,id);
		
		System.out.println(p);
		
		System.out.println("done");
		
		sc.close();
		session.close();
		sf.close();
		
	}
}
