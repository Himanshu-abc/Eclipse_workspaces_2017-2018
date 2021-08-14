package com.demo.fetching;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Test {

	public static void main(String[] args) {
	
		AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
		
	    SessionFactory sf=acfg.buildSessionFactory();
	    
	    Session s=sf.openSession();
	    
	    Alien a=(Alien) s.get(Alien.class,1);
	    
	    Collection<Laptop> cl= a.getLaptop();
	    
	    for(Laptop l : cl) {
	    	System.out.println(l.getLid()+" "+l.getBrand()+" "+l.getPrice());
	    }
	    System.out.println(a.hashCode());
	    
	    s.close();
	    sf.close();
	}
}
