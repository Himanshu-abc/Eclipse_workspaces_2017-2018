package com.app.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class EmployeeDao {
	
	public static int register(Employee e) {
		
		int status=0;
		
		AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
		
		SessionFactory sf=acfg.buildSessionFactory();
		
		Session sess=sf.openSession();
		
		sess.beginTransaction().begin();
		
	    status=(int) sess.save(e);
		
	    sess.getTransaction().commit();
	    
	    sess.close();
	    sf.close();
	    
		return status;
	}

}
