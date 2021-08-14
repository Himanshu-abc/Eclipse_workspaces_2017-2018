package com.app.jpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Alien a=new Alien();
    	a.setAid(104);
    	a.setAname("joseph");
    	a.setColor("brown");
    	
       EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
       
       EntityManager em=emf.createEntityManager();
       
       /*Alien a1=em.find(Alien.class, 102);
       print(a1);*/
       em.getTransaction().begin();
       
       em.persist(a);
       System.out.println(a);
       
       em.getTransaction().commit();
    }
}