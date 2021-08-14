package com.bean.employee;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
		
		SessionFactory sf=acfg.buildSessionFactory();
		
		Session s=sf.openSession();
	
		s.beginTransaction().begin();
		
		Query q=s.createQuery("from Employee");
		
		q.setFirstResult(21);
		q.setMaxResults(10);
		
		List<Employee> l=q.list();
		
		for(Employee e :l) {
			System.out.println(e.getId()+" : "+e.getName()+" : "+e.getSalary());
		}
		
		s.getTransaction().commit();
	}
}
