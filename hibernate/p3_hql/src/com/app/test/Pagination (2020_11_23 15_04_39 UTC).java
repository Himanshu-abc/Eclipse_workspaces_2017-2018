package com.app.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.app.bean.Employee;

public class Pagination {

	public static void main(String[] args) {
	
        AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
		
		SessionFactory sf=acfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Query q=s.createQuery("from Employee");
		
		q.setFirstResult(7);
		q.setMaxResults(5);
		
	    List<Employee> l=q.list();
	    
	    for(Employee ee:l) {
	    	System.out.println(ee);
	    }
	    System.out.println("done");
	    s.close();
	    sf.close();
	}
}
