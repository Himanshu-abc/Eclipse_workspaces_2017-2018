package com.app.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.bean.City;
import com.app.bean.Employee;

@Controller
public class EmployeeController3 {

	@RequestMapping("/reg3")
	public ModelAndView openRegPage() {
		Employee emp=new Employee();
		ModelAndView mav=new ModelAndView("empReg3","emp",emp);
			return mav;
	}	
	
	@ModelAttribute("quals")
	public String[] getQualifications(){
		String[] q={"BE","ME","MTech","BCA","MCA","Diploma"};
		return q;
	}	
	
	@ModelAttribute("hbs")
	public List<String> getHobbies(){
		ArrayList<String> al=new ArrayList<>();
		al.add("Reading");
		al.add("Travelling");
		al.add("Chatting on Whatsapp");
		return al;
	}

	
	@ModelAttribute("cts")
	public List<City> getCities(){
		ArrayList<City> cl=new ArrayList<>();
		cl.add(new City("INDB","Indore"));
		cl.add(new City("BPL","Bhopal"));
		cl.add(new City("MB","Mumbai"));
		cl.add(new City("PUN","Pune"));
		
		return cl;
		
	}
	@RequestMapping("/doEmpReg3")
	public ModelAndView doRegistration(@ModelAttribute("emp") Employee e) {
		System.out.println(e);
		if(e.getSalary()<10000)
		{
			ModelAndView mav=new ModelAndView("empReg3","emp",e);
					mav.addObject("error", "Invalid Salary");
			return mav;	
		}
		ModelAndView mav=new ModelAndView("message");
		return mav;	
	}
	
	
	

	private static final String dateFormat = "dd-MMM-yyyy";

	@InitBinder
	public void init(WebDataBinder binder) {
		// Allow for null values in date fields.
		SimpleDateFormat sf=new SimpleDateFormat(dateFormat);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sf,true));
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
}
