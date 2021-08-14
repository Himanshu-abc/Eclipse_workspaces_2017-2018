package com.app.bean;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MessageController {
	
	@RequestMapping("/{name}/{country}")
	public ModelAndView function(@PathVariable("name") String name,@PathVariable("country") String country) {
		
		ModelAndView mav=new ModelAndView("Display");
	    mav.addObject("message","hello "+name+" from "+country);
		
	    return mav;
	}

}
