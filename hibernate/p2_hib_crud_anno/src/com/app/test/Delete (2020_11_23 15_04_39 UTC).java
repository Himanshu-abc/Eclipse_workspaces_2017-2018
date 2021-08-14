package com.app.test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.app.entity.Student;

public class Delete {

	public static void main(String[] args) {
	
		AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
		
		SessionFactory sf=acfg.buildSessionFactory();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id to delete");
		int id=sc.nextInt();
		
		Session s=sf.openSession();
		Student st=(Student) s.get(Student.class,id);
		s.beginTransaction();
		s.delete(st);
		s.getTransaction().commit();
		System.out.println("done");
		s.close();
		sf.close();
	}
}
