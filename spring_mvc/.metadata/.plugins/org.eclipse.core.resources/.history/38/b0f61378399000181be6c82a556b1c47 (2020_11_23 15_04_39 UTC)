package com.app.dispatcher;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping(value="/AdmissionForm" , method = RequestMethod.GET)
	public ModelAndView function() {
		
		ModelAndView mav=new ModelAndView("AdmissionForm");
		return mav;
	}
	@RequestMapping(value="/SubmmittedDetails.html", method = RequestMethod.POST)
	public ModelAndView function1(@RequestParam Map<String, String> map) {
		
	/*public ModelAndView function2(@RequestParam(value="name",defaultValue="abcdef") String name ,@RequestParam("hobby") String hobby) {*/	
	
		String name=map.get("name");
		String hobby=map.get("hobby");
		
		ModelAndView mav=new ModelAndView("Successful");
		mav.addObject("message","hello "+name+" your hobby is "+hobby+"  Congratulation your details are successfully Displayed");
		return mav;
		
	}
}
