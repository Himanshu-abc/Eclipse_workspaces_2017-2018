package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentControllerClass {

	@RequestMapping(value="/StudentForm",method=RequestMethod.GET)
	public ModelAndView function() {
	
		ModelAndView mav=new ModelAndView("StudentForm");
		mav.addObject("message2","This is Student Admission Form");
		mav.addObject("message1","Havard School of Witchcraft");
		return mav;
	}
	@RequestMapping(value="/StudentDetail.html", method=RequestMethod.POST)
	public ModelAndView function2(@ModelAttribute(value="st") Student st) {
		
		ModelAndView mav=new ModelAndView("Successful");
		mav.addObject("message","student details are as follow name : ");
		return mav;
	}
}