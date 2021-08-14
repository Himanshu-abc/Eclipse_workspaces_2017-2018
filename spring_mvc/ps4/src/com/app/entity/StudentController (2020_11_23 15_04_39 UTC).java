package com.app.entity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {

	@RequestMapping(value="/form",method=RequestMethod.GET)
	public ModelAndView function(){
		
		ModelAndView mav=new ModelAndView("form");
		return mav;
	}
	
	@InitBinder
	public void function3(WebDataBinder binder) {
		binder.setDisallowedFields("mobileNumber");
	}
	
	@ModelAttribute
	public void commonMethod(Model m) {
		  m.addAttribute("message","This are Students Details"); 
	}
	
	@RequestMapping(value="/StudentDetail.html",method=RequestMethod.POST)
	public ModelAndView function2(@ModelAttribute(value="st") Student st,BindingResult result) {
		
	if(result.hasErrors()) {
		ModelAndView mav=new ModelAndView("form");
		return mav;
	}
	ModelAndView mav=new ModelAndView("display");
	return mav;
	}
}