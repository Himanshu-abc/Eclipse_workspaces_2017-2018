package com.app.entity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentCntroller {

	@RequestMapping(value="form",method=RequestMethod.GET)
	public ModelAndView function() {
		
		ModelAndView mav=new ModelAndView("form");
		return mav;
	}
	
	@ModelAttribute
	public void function1(Model m) {
		m.addAttribute("message1","This is for Students");
	}
	
	@RequestMapping(value="/formSubmit.html",method=RequestMethod.POST)
	public ModelAndView function2(@ModelAttribute(value="st") Student st) {
			
		ModelAndView mav=new ModelAndView("display");
		mav.addObject("message","student detail are as follow : ");
		return mav;
	}
}