package com.app.bean;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageDispatcher {
	
	@RequestMapping("/{name}/{country}")
	public ModelAndView function(@PathVariable Map<String,String> map) {
		
		String name=map.get("name");
		String country=map.get("country");
		
		ModelAndView mav=new ModelAndView("Display");
		mav.addObject("message","Hello "+name+" from "+country );
		
		return mav;
	}
}