package com.app.bean_and_controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

	private String listOfValidFiles;
	
	@Override
	public void initialize(IsValidHobby isValidHobby) {
		this.listOfValidFiles=isValidHobby.listOfValidFiles();
		
	}

	@Override
	public boolean isValid(String hobby, ConstraintValidatorContext ctx) {
		
		if (hobby == null) 
		{	
		return false;
		}
		
		if(hobby.matches(listOfValidFiles)) {
			return true;
		}
		else {
		
			return false;
		}
	}
}
