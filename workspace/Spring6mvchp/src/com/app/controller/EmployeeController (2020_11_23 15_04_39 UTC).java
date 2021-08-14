package com.app.controller;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.app.bean.Employee;

@Controller
public class EmployeeController {
	
	@RequestMapping("/e_reg")
	public ModelAndView openreg(){
		
		Employee e= new Employee();
		ModelAndView mav= new ModelAndView("eReg" ,"e" ,e);
		return mav;	
	}
	
	@RequestMapping("/doEReg")
	public ModelAndView doreg (@ModelAttribute("e") Employee emp){
		System.out.println(emp);
		
		
		if(emp.getSalary()<=5000){
			ModelAndView mav= new ModelAndView("eReg","error","Invalid Salary");
			return mav;
		}
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session sess=sf.openSession();
		sess.beginTransaction();
		sess.save(emp);
		sess.getTransaction().commit();
		sess.clear();
		sf.close();
		ModelAndView mav=new ModelAndView("redirect:/showAllEmp");
		return mav;
	}
		
       public List<Employee> getdata(){
			ArrayList<Employee> al =null;
			SessionFactory sf =new Configuration().configure().buildSessionFactory();
			Session sess =sf.openSession();
			String hql="from Employee";
			Query q=sess.createQuery(hql);
			al=(ArrayList<Employee>) q.list();
			sess.close();
			sf.close();
			return al;
		}
		@RequestMapping("/showAllEmp")
		public ModelAndView showall(){	
			
		List<Employee> el = getdata();	
		
		ModelAndView mav=new ModelAndView("showemp","elist",el);
		return mav;
		}
		
		
		
		@RequestMapping("/delete")
		public ModelAndView delete(@RequestParam("empid")int id){
			
			Configuration cfg=new Configuration();
			cfg.configure();
			SessionFactory sf=cfg.buildSessionFactory();
			Session sess=sf.openSession();
			String hql = "delete from Employee where empid= :id"; 
			Query q= sess.createQuery(hql);
			q.setParameter("id",id);
			q.executeUpdate();
			sess.close();
			sf.close();
			ModelAndView mav=new ModelAndView("redirect:/showAllEmp");
			return mav;
		}
		
		
		
		public Employee getbyid(int id){
			
			Employee e1=new Employee();
            SessionFactory sf = new Configuration().configure().buildSessionFactory();
			Session sess=sf.openSession();
			String hql = "from Employee where empid = :id"; 
			Query q= sess.createQuery(hql);
			q.setParameter("id", id);
			e1=(Employee) q.uniqueResult();
			sess.close();
			sf.close();	
			return e1;
		}
		
		@RequestMapping("/update")
		public ModelAndView update(@RequestParam("empid")int id){
			Employee em=new Employee();
			 em=getbyid(id);
			
		ModelAndView mav= new ModelAndView("update1","em",em);
	    return mav;
		}
		
		@RequestMapping("/update1")
			public ModelAndView update1(@ModelAttribute("em") Employee e3){
			
			SessionFactory sf= new Configuration().configure().buildSessionFactory();
			Session sess = sf.openSession();
			sess.beginTransaction();
			sess.saveOrUpdate(e3);
			sess.getTransaction().commit();
			sess.close();
			sf.close();
			
		   ModelAndView nav=new ModelAndView("redirect:/showAllEmp");
		   return nav;	
		}	
}
