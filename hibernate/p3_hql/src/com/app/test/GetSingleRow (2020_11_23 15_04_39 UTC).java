package com.app.test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class GetSingleRow {

	public static void main(String[] args) {
	
        AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
		
		SessionFactory sf=acfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Query q=s.createQuery("select name,salary from Employee where id=:id");
		q.setInteger("id",4);
		
	    Object[] o=(Object[]) q.uniqueResult();
	    
	    System.out.println(o[0]+" "+o[1]);
	    
	    System.out.println("done");
	    s.close();
	    sf.close();
	}
}
