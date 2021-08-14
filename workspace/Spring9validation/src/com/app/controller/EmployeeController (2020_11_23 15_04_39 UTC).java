package com.app.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.bean.Employee;

@Controller
public class EmployeeController {
	
	@RequestMapping(value="/new_emp")
	public ModelAndView newEmp(){
		ModelAndView mav=new ModelAndView("emp");
		Employee e=new Employee();
		mav.addObject("employee", e);
		
		return mav;
	}
	@RequestMapping(value="save_emp")
	public String saveEmp(@Valid @ModelAttribute("employee") Employee employee,BindingResult result){
		if(result.hasErrors()){
			return "emp";	
			}
	
		/*if(employeeDAO.findById(employee.getEmpId())!=null){
					result.rejectValue("empId", "invalid.employee.empId", "Duplicate EmplId");
					return "emp";
		}*/
		
		System.out.println(employee);
		//employeeDAO.save(employee);
		return "redirect:/success";
		
	}
	
	private static final String dateFormat = "dd/MM/yyyy";
	@InitBinder
	public void init(WebDataBinder binder) {
		// Allow for null values in date fields.
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat(dateFormat), true));
		
		// tell spring to set empty values as null instead of empty string.
	//	binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));

	}
	
}
