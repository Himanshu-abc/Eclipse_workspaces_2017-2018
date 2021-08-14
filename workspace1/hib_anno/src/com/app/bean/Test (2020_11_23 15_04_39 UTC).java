package com.app.bean;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		AnnotationConfiguration acfg = new AnnotationConfiguration().configure();
		
		SessionFactory sf=acfg.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Employee e=new Employee();
		
		System.out.println("enter employee id");
		int id=sc.nextInt();
		e.setId(id);
		
		System.out.println("enter employee name");
		String name=sc.next();
		e.setName(name);
		
		System.out.println("enter employee password");
		String pass=sc.next();
		e.setPass(pass);
		
		System.out.println("enter employee attendence number");
		int num=sc.nextInt();
		e.setNum(num);
		
		session.beginTransaction().begin();
		session.save(e);
		session.getTransaction().commit();
		
		session.close();
	    sf.close();
	    
	    System.out.println("completed");
	}
}
