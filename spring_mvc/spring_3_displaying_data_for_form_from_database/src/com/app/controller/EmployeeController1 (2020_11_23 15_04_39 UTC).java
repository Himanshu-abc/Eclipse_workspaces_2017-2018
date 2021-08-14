package com.app.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.bean.City;
import com.app.bean.Employee;

@Controller
public class EmployeeController1 {

	@RequestMapping("/reg1")
	public ModelAndView openRegPage() {
		Employee emp=new Employee();
		ModelAndView mav=new ModelAndView("empReg1","emp",emp);
		
		String[] q={"BE","ME","MTech","BCA","MCA","Diploma"};
		mav.addObject("quals", q);
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Reading");
		al.add("Travelling");
		al.add("Chatting on Whatsapp");
		
		mav.addObject("hbs", al);
		
		ArrayList<City> cl=new ArrayList<>();
		cl.add(new City("INDB","Indore"));
		cl.add(new City("BPL","Bhopal"));
		cl.add(new City("MB","Mumbai"));
		cl.add(new City("PUN","Pune"));
		
		mav.addObject("cts", cl);
		
			return mav;
	}
	@RequestMapping("/doEmpReg1")
	public ModelAndView doRegistration(@ModelAttribute("emp") Employee e) {
		System.out.println(e);
		if(e.getSalary()<10000)
		{
			ModelAndView mav=new ModelAndView("empReg1","emp",e);
			return mav;	
		}
		ModelAndView mav=new ModelAndView("message");
		return mav;	
	}
}
