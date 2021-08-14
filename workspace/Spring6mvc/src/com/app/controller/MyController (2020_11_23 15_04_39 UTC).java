package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("/first")
	public ModelAndView showMyPage(){
		ModelAndView mav=new ModelAndView("hello");
		mav.addObject("msg", "Thanks for visiting my Site");
		return mav;
	}
	
	@RequestMapping("/second")
	public ModelAndView showMyPage1(){
		ModelAndView mav=new ModelAndView("hello","msg", "Thanks for visiting my Site1");
		return mav;
	}
	
	
	@RequestMapping("/third")
	public String showMyPage2(){		
		return "hello";
	}	
	
	@RequestMapping("/four")
	public String showMyPage3(ModelMap map){
		map.put("msg", "MEssage form Model Map");
		return "hello";
	}

	
	@RequestMapping("/five")
	public String showMyPage5(Model model){
		model.addAttribute("msg", "MEssage form Model");
		return "hello";
	}

	@RequestMapping("/reg")
	public String showReg(){		
		return "input";
	}
	
	
	@RequestMapping("/doReg")
	public ModelAndView doRegistration(@RequestParam("name")String nm,@RequestParam("age")int ag){
		System.out.println("NAme="+nm);
		System.out.println("Age="+ag);
		ModelAndView mav=new ModelAndView("hello");
		mav.addObject("msg", "Name="+nm+" <br>Age="+ag);
		return mav;
	}
}
