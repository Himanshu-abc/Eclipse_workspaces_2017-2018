package com.app.demoHib_maven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
	
    public static void main( String[] args )
    {
        Alien a=null;
        
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Alien.class);
        
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
        
        SessionFactory sf=cfg.buildSessionFactory(reg);
        
        Session s1=sf.openSession();
        
        Transaction tx=s1.beginTransaction();
        
        a=(Alien) s1.get(Alien.class,101);
        System.out.println(a);
        
        tx.commit();
        s1.close();
        
        Session s2=sf.openSession();
        s2.beginTransaction();
        
        a=(Alien) s2.get(Alien.class,101);
        System.out.println(a);
        
        s2.getTransaction().commit();
    }
}
