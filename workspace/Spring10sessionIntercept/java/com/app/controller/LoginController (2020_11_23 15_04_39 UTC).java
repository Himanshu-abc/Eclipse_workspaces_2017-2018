package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.app.bean.User;

@Controller

public class LoginController {
	@RequestMapping("/login")
	public ModelAndView showLogin(){
		ModelAndView mav=new ModelAndView("login");
		User u=new User();
		mav.addObject("user", u);
		return mav;
	}
	
	@RequestMapping(value="/checkLogin",method=RequestMethod.POST)
	public String checkLogin(@ModelAttribute("user")User u,Model model,HttpSession session){
	//	System.out.println("Session : "+session.getId()+"\n Status : "+session.isNew());
		if("mohan".equals(u.getUserid()) && "aaaa".equals(u.getPassword())){
			session.setAttribute("uid", u.getUserid());
			return "redirect:/home";
		}
		model.addAttribute("error", "Invalid Userid/Password");
		return "login";		
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session)
	{
		session.invalidate();
		return "redirect:/login";
	}
	
	
	
	@RequestMapping("/invalidUser")
	public String invalid()
	{
		return "invalidUser";
	}
}
