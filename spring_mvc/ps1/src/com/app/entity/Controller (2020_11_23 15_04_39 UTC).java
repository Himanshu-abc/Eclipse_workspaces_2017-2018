package com.app.entity;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/greet")
	public ModelAndView function1() {
		ModelAndView mav=new ModelAndView("Display");
		mav.addObject("message","welcome to jungle");
		return mav;
	}
}
