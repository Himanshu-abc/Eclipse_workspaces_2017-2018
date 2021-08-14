package com.app.mapping_1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
	
		AnnotationConfiguration cfg=new AnnotationConfiguration().configure();
		
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Laptop l=new Laptop();
		l.setLid(1);
		l.setLname("dell");
		
		Student st=new Student();
		st.setRoll_no(1);
		st.setName("rahul");
		st.setMarks(50);
		st.getLaptop().add(l);
		
		l.getStud().add(st);
		
		s.beginTransaction().begin();
		
		s.save(l);
		s.save(st);
		
		s.getTransaction().commit();
		
		s.close();
		sf.close();
	}
}
