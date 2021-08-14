package com.app.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.bean.Course;
import com.app.bean.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/reg")
	public ModelAndView openreg(){
		Student st = new Student();
		ModelAndView mav = new ModelAndView("stureg","stu",st);
		
		ArrayList<String> ct = new ArrayList<>();
		ct.add("indore");
		ct.add("bhopal");
		ct.add("ujjain");
		ct.add("romania");
		mav.addObject("city", ct);
		
		ArrayList<Course> cs=new  ArrayList<>();
		cs.add(new Course("cs","computer science"));
		cs.add(new Course("me","mechanical engineering"));
		cs.add(new Course("ce","civil"));
		cs.add(new Course("cm","chemical"));
		mav.addObject("course", cs);
		return mav;
	}	  
}
