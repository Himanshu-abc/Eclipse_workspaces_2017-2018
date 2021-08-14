package com.app.bean_and_controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/form")
	public ModelAndView function() {
		Employee emp=new Employee();
	    ModelAndView mav=new ModelAndView("form", "emp", emp);
		return mav;
	}
	@RequestMapping("/doEmpReg")
	public ModelAndView function2(@ModelAttribute("emp") Employee emp) {
		ModelAndView mav=new ModelAndView("display");
		return mav;
	}
	@RequestMapping("/showall")
	public ModelAndView function3() {
		List<Employee> l=new ArrayList<Employee>();
		l.add(new Employee(1, "darsy", 0000.0));
		l.add(new Employee(2, "loki", 9999999.99));
		l.add(new Employee(3, "hela", 10000000.0));
		
		ModelAndView mav=new ModelAndView("showall");
		mav.addObject("list",l);
		return mav;
	}
}