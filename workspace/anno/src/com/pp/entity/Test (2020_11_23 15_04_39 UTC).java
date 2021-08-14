package com.pp.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {
//		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Scanner sc=new Scanner(System.in);
		SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session session=sf.openSession();
		Student s=new Student();
		System.out.println("Enter Sid:");
		int sid=sc.nextInt();
		System.out.println("Enter Name:");
		String nm=sc.next();
		System.out.println("Enter Course:");
		String c=sc.next();
		System.out.println("Enter Fees:");
		double f=sc.nextDouble();
		
		System.out.println("Enter Admission Date(dd/MM/yyyy):");
		String d=sc.next();
		Date ad=null;
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		try {
			ad=sdf.parse(d);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		s.setSid(sid);
		s.setName(nm);
		s.setCourse(c);
		s.setFees(f);
		s.setAdDate(ad);
		
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();
		session.close();
		sc.close();
		System.out.println("Done");

	}

}
