package com.app.hib_latest_m;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Alien a=new Alien();
    	
    	a.setAid(101);
    	a.setAname("raj");
    	a.setColor("black");
    	
        Configuration cfg=new Configuration().configure();
        
        SessionFactory sf=cfg.buildSessionFactory();
        
        Session s=sf.openSession();
        
        Transaction tx=s.beginTransaction();
        
        s.save(a);
        
        tx.commit();
        
        System.out.println("done");
        
    }
}
