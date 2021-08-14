package com.app.bean_and_controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@InitBinder
	public void function3(WebDataBinder binder) {
		/*binder.setDisallowedFields(new String[] {"mobileNumber"});*/
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy****mm****dd");
		binder.registerCustomEditor(Date.class, "DOB",new CustomDateEditor(sdf, false));
		binder.registerCustomEditor(String.class, "name", new StudentNameEditor());
	}

	@RequestMapping(value="/StudentForm" , method=RequestMethod.GET)
	public ModelAndView function1() throws Exception{
		
		ModelAndView mav=new ModelAndView("StudentForm");
		mav.addObject("message1","please fill your details");
		return mav;
	}
	
	@ModelAttribute
	public void CommomMethod(Model model) {
		model.addAttribute("message","Trinity School of Grammer");
	}
	
	@RequestMapping(value="/StudentDetail.html" , method=RequestMethod.POST)
	public ModelAndView function2( @Valid @ModelAttribute("student") Student student, 
			BindingResult result){
	 
	if(result.hasErrors()) {
		ModelAndView m=new ModelAndView("StudentForm");
		return m;
	}
	
	ModelAndView mav=new ModelAndView("Display");
	mav.addObject("message2","congratulation ! , you are successfully enrolled");
	return mav;
	}
	
	@ResponseBody
	@RequestMapping(value="/Students", method=RequestMethod.GET)
	public List<Student> getStudentList(){
	
		Student s1=new Student();
		s1.setName("The Great Khali");
		
		Student s2=new Student();
		s2.setName("The Undertaker");
		
		Student s3=new Student();
		s3.setName("John Cena");
		
		List<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		return list;
	}
	
}
