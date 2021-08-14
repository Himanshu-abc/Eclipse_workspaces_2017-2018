package com.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/myPage")
	public ModelAndView showPage(){
		ModelAndView mav=new ModelAndView("hello");
		mav.addObject("msg", "Welcome to Visit My Page");
		return mav;
	}
	
	
	@RequestMapping("/myPage1")
	public ModelAndView showPage1(){
		ModelAndView mav=new ModelAndView("hello","msg", "Welcome to Visit My Page1");
		return mav;
	}
	
	@RequestMapping("/myPage3")
	public String showPage3(){
		return "hello";
	}
	
	@RequestMapping("/reg")
	public String showRegPage(){
		return "input";
	}
	
	
	@RequestMapping("/doReg")
	public ModelAndView doRegistration(@RequestParam("nm")String name,@RequestParam("ag")int age){
		System.out.println("name="+name);
		System.out.println("Age="+age);
		if(age<18){
			ModelAndView mav=new ModelAndView("input","err","invalid age");	
			
			return mav;
		}
		
		ModelAndView mav=new ModelAndView("hello");
		mav.addObject("name", name);
		mav.addObject("age", age);
		
		return mav;
	}
	
	
}
