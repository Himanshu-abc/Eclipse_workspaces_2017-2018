package com.app.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.app.bean.Employee;

public class GetUiqueAttribute {

	public static void main(String[] args) {
	
        AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
		
		SessionFactory sf=acfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Query q0=s.createQuery("select name from Employee where id=:id");
		q0.setInteger("id",1);
		
		String name=(String) q0.uniqueResult();
		
		System.out.println(name);
		
		s.close();
		sf.close();
	}
}
