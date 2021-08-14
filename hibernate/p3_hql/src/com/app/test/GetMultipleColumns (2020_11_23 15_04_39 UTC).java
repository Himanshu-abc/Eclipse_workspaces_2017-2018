package com.app.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class GetMultipleColumns {

	public static void main(String[] args) {
	
		 AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
			
			SessionFactory sf=acfg.buildSessionFactory();
			
			Session s=sf.openSession();
			
			Query q=s.createQuery("select name,salary from Employee");
			
		    List<Object[]> ls= q.list();
		    
		    for(Object[] oo:ls) {
		    	System.out.println(oo[0]+" "+oo[1]);
		    }
		    System.out.println("done");
		    s.close();
		    sf.close();
	}
}
