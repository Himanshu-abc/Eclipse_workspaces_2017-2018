package hib_criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfiguration acfg=new AnnotationConfiguration().configure();
		
		SessionFactory sf=acfg.buildSessionFactory();
		
		Session s=sf.openSession();
		
		s.beginTransaction().begin();
		
		Criteria c=s.createCriteria(Employee.class);
		
		Disjunction d=Restrictions.disjunction();
		
		d.add(Restrictions.lt("salary",2000.0));
		d.add(Restrictions.gt("salary",8000.0));
		c.add(d);
		c.addOrder(Order.asc("id"));
		
		/*Conjunction co=Restrictions.conjunction();
		
		co.add(Restrictions.lt("salary",2000.0));
		co.add(Restrictions.between("id",10,40));
		
		c.add(co);*/
		
		//criteria chaining example
		/*c.add(Restrictions.lt("salary",2000.0)) .add(Restrictions.gt("salary", 3000.0));*/
		
		List<Employee> li=c.list();
		
		for(Employee e : li) {
			System.out.println(e.getId()+" : "+e.getName()+" : "+e.getSalary());
		}
		
		s.getTransaction().commit();
	}
}
