package com.app.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Count {

	public static void main(String[] args) {
	
        AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
		
		SessionFactory sf=acfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Query q=s.createQuery("select count(*) from Employee");
		
	    Number n=(Number) q.uniqueResult();
	    Long l=(Long) n;
	    
	    System.out.println(l);
	    
	    System.out.println("done");
	    s.close();
	    sf.close();
	}
}
