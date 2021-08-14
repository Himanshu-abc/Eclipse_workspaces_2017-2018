package g3_Multi_Action_Controller_Class;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("class1")
public class MessageDispatcher {
	
	@RequestMapping("/message")
	public ModelAndView function() {
		
		ModelAndView mav=new ModelAndView("Display");
		mav.addObject("message","hello welcome to lebanon");
		return mav;
	}
	
	@RequestMapping("/message2")
	public ModelAndView function2() {
		
		ModelAndView mav=new ModelAndView("Display");
	    mav.addObject("message","hello welcome to bairut");
	    return mav;
	}

}
