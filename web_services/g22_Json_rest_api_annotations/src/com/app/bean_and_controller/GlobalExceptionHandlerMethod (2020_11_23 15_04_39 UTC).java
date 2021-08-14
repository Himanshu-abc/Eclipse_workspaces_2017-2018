package com.app.bean_and_controller;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandlerMethod {

	@ExceptionHandler(value=NullPointerException.class)
	public String function4(Exception e) {
		
		System.out.println("Null Pointer Exception "+e);
		return "NullPointerException";
	}
	@ExceptionHandler(value=IOException.class)
	public String function5(Exception e) {
		
		System.out.println("IO Exception Occured" + e);
		return "IOException";
	}
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String function6(Exception e) {
		
		System.out.println("Exception occured "+e);
		return "Exception";
	}
	
}
