package com.app.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class GetFromList {

	public static void main(String[] args) {
	
        AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
		
		SessionFactory sf=acfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
	    System.out.println("done");
	    s.close();
	    sf.close();
	}
}
