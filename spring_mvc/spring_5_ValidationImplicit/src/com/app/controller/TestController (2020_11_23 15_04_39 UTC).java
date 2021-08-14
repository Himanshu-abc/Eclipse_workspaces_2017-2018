package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.bean.User;

@Controller
public class TestController {
	

	@RequestMapping("/show")
	public ModelAndView showForm(){
		ModelAndView mav=new ModelAndView("input");
		mav.addObject("user", new User());
		return mav;
	}
	@RequestMapping("/doReg")
	public ModelAndView doRegistration(@ModelAttribute("user")User u,BindingResult result){
		ModelAndView mav;
		
		System.out.println(u);
		
		if(u.getAge()!=null && u.getAge()<=0){
			result.rejectValue("age","negative.user.age","age must be positive value");
		}
		
		if(u.getName()==null || u.getName().isEmpty()){
				result.rejectValue("name", "required.user.name", "Name can not be Empty");
		}
		
		if(u.getSalary()!=null && u.getSalary()<2000){
			result.rejectValue("salary","invalid.user.salary","salary must not be less than 2000");
		}		
		if(result.hasErrors()){
			mav=new ModelAndView("input");
			return mav;
		}
		mav=new ModelAndView("success");
		mav.addObject("msg","Data Processed");
		return mav;
	}
}