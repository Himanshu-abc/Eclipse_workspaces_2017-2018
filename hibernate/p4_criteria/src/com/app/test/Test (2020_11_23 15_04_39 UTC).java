package com.app.test;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Conjunction;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import com.app.entity.Employee;

public class Test {

	public static void main(String[] args) {
	
		AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
		
		SessionFactory sf=acfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		Criteria c=s.createCriteria(Employee.class);
		
		Conjunction c1=Restrictions.conjunction();
		
		c1.add(Restrictions.like("name","a",MatchMode.START));
		c1.add(Restrictions.between("salary",30000f,75000f));
		
		c.add(c1);
		List<Employee> l=c.list();
		
		for(Employee ee:l) {
			System.out.println(ee);
		}
		
		s.close();
		sf.close();
	}
}
