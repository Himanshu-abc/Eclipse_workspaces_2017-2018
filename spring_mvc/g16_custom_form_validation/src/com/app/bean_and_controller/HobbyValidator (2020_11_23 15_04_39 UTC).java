package com.app.bean_and_controller;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class HobbyValidator implements ConstraintValidator<IsValidHobby, String>{

	@Override
	public void initialize(IsValidHobby isValidHobby) {
		
	}

	@Override
	public boolean isValid(String hobby, ConstraintValidatorContext ctx) {
		
		if (hobby == null) 
		{	
		return false;
		}
		
		if(hobby.matches("volleyball|music|football|cricket")) {
			return true;
		}
		else {
		
			return false;
		}
	}
}
