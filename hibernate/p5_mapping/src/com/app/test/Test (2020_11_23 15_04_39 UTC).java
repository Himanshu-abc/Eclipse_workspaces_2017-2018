package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.app.entity.Laptop;
import com.app.entity.Student;

public class Test {

	public static void main(String[] args) {
		
		Laptop l=new Laptop();
		l.setLid(101);
		l.setLname("dell");
		
		Student st=new Student();
		st.setId(1);
		st.setName("john");
		st.setMarks(50);
		st.getLaptop().add(l);
		
		l.getStudent().add(st);
	
		AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
		
		SessionFactory sf=acfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		s.beginTransaction();
		s.save(l);
		s.save(st);
		s.getTransaction().commit();
		
		System.out.println("done");
		
		s.close();
		sf.close();
	}
}