package com.app.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class GetColumn {

	public static void main(String[] args) {
	
       AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
		
		SessionFactory sf=acfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Query q=s.createQuery("select name from Employee");
		
	    List<String> ls=q.list();
	    
	    for(String sn:ls) {
	    	System.out.println(sn);
	    }
	    System.out.println("done");
	    s.close();
	    sf.close();
	}
}
