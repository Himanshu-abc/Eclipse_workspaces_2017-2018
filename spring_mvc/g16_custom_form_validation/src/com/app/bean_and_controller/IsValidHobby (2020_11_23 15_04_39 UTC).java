package com.app.bean_and_controller;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented                                              //for jsr-303 implementation (ignore this)
@Constraint(validatedBy = HobbyValidator.class)
@Target({ElementType.FIELD})                             //for jsr-303 implementation (ignore this)
@Retention(RetentionPolicy.RUNTIME)                      //for jsr-303 implementation (ignore this)
public @interface IsValidHobby {                         //for jsr-303 implementation (ignore this)

	String message() default "please provide a valid hobby" + 
	" accepted hobbies are - volleyball,music,football,cricket, (choose any - one)";

	 Class<?>[] groups() default {};                      //for jsr-303 implementation (ignore this)
     
	    Class<? extends Payload>[] payload() default {};  //for jsr-303 implementation (ignore this)
}
