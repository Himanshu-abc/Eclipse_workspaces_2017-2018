package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/message")
	public ModelAndView function() {
		
		ModelAndView mav=new ModelAndView("Display");
		mav.addObject("message", "Hello, Welcome back after a long time");
		return mav;
	}
	@RequestMapping("/message2")
	 public ModelAndView function2() {
		 
		 ModelAndView mav=new ModelAndView("Display");
		 mav.addObject("message", "this is just the beginning of end");
		 return mav;
	 }
	@RequestMapping("/message3")
	public String function3() {
           // empty page      
	return "Display";
	}
}
