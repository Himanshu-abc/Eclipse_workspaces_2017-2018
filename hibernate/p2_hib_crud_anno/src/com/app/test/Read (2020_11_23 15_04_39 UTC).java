package com.app.test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.app.entity.Student;

public class Read {

	public static void main(String[] args) {
		
		AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
		
		SessionFactory sf=acfg.buildSessionFactory();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter id");
        int id=sc.nextInt();
		
		Session s=sf.openSession();
		Student st=new Student();
        st=(Student)s.get(Student.class,id);
        
        System.out.println(st);
        System.out.println("done");
        
        sc.close();
        s.close();
        sf.close();
	}
}
