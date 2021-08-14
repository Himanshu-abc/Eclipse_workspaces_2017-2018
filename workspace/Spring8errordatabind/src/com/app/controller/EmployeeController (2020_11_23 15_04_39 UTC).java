package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.bean.Employee;

@Controller
public class EmployeeController {

	@RequestMapping("/reg")
	public ModelAndView openRegPage() {
		Employee emp=new Employee();
		ModelAndView mav=new ModelAndView("empReg","emp",emp);
			return mav;
	}
	@RequestMapping("/doEmpReg")
	public ModelAndView doRegistration(@ModelAttribute("emp") Employee e) {
		System.out.println(e);
		ModelAndView mav=new ModelAndView("message");
		return mav;	
	}
}
