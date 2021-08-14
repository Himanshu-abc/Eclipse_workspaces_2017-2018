package com.app.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.app.entity.Student;

public class Update {
	
	public static void main() {
		
	AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
	
	SessionFactory sf=acfg.buildSessionFactory();
	
	Date d=null;
	
	Scanner sc=new Scanner(System.in);
	Student st=new Student();
	
	System.out.println("enter update details");
	
	System.out.println("enter id");
	int id=sc.nextInt();
	st.setId(id);
	
	System.out.println("enter name");
	String name=sc.next();
	st.setName(name);
	
	System.out.println("enter course");
	String course=sc.next();
	st.setCourse(course);
	
	System.out.println("enter fess");
	double fees=sc.nextDouble();
	st.setFees(fees);
	
	System.out.println("enter date (dd/mm/yyyy)");
	String sdate = sc.next();
	
	try {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		d=sdf.parse(sdate);
		st.setDate(d);
	}catch (Exception e) {
		System.out.println(e);
	}
	Session s=sf.openSession();
	
	s.saveOrUpdate(st);
	s.getTransaction().commit();
	
	s.close();
	sf.close();
	}
}
