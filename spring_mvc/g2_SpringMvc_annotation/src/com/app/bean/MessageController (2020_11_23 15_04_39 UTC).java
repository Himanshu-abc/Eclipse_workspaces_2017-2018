package com.app.bean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {
	
	@RequestMapping("/message")
	public ModelAndView function() {
		
		ModelAndView mav=new ModelAndView("MessageDisplay");
		mav.addObject("message", "hello welcome to the world of programming");
		
		return mav;
	}

}
