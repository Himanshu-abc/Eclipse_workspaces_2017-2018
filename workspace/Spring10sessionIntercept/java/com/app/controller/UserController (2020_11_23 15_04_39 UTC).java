package com.app.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionAttributeStore;

@Controller

@SessionAttributes("uid")
public class UserController {
	@RequestMapping("/home")
	public String showHome(@ModelAttribute("uid")String uid){	
		System.out.println(uid);		
		return "home";
	}
}
