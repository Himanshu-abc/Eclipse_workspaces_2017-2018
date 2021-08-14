package com.app.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.app.bean.Employee;

public class GetSelected {

	public static void main(String[] args) {
	
		AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
		
		SessionFactory sf=acfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Query q0=s.createQuery("from Employee where id=:id");
		q0.setInteger("id",1);
		
		/*Query q=s.createQuery("from Employee where id=?");
		q.setInteger(0,1);*/
		
		Employee ee=(Employee) q0.uniqueResult();
		
		System.out.println(ee);
		
		s.close();
		sf.close();
	}
}
