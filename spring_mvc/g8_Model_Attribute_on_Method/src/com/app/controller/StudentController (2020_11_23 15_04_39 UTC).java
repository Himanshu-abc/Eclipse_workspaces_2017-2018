package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@RequestMapping(value="/StudentForm" ,method=RequestMethod.GET)
	public ModelAndView function() {
		
		ModelAndView mav=new ModelAndView("StudentForm");
		return mav;
	}
	
	@ModelAttribute
	public void commonObject(Model model) {
		model.addAttribute("message", "Trinity School of Grammer");
	}
	
	@RequestMapping(value="StudentDetails.html" ,method=RequestMethod.POST)
	public ModelAndView function2(@ModelAttribute(value="s") Student s) {
		
		ModelAndView mav=new ModelAndView("Successfull");
		return mav;
	}

}
