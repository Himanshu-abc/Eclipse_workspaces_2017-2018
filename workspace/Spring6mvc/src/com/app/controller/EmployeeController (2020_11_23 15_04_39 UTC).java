package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.bean.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/emp-reg")
	public ModelAndView openRegPage() {
		Employee emp=new Employee();
		ModelAndView mav=new ModelAndView("empReg","emp",emp);
			return mav;
	}
	@RequestMapping("/doEmpReg")
	public ModelAndView doRegistration(@ModelAttribute("emp") Employee e) {
		System.out.println(e);
		if(e.getSalary()<=10000){
			ModelAndView mav=new ModelAndView("empReg","error","Invalid Salary");
			return mav;
		}
		ModelAndView mav=new ModelAndView("hello");
			return mav;
	}
	@RequestMapping("/showAllEmp")
	public ModelAndView showAll(){
		List<Employee> l=new ArrayList<>();
		l.add(new Employee(1,"Ramesh",12000.0));
		l.add(new Employee(2,"Suresh",32000.0));
		l.add(new Employee(3,"Mahesh",21000.0));
		ModelAndView mav=new ModelAndView("show","list",l);
		return mav;
		
	}
	
}

