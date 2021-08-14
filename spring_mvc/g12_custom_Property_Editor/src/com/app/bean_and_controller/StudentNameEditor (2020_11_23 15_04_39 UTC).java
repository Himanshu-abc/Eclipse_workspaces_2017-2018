package com.app.bean_and_controller;

import org.springframework.beans.propertyeditors.PropertiesEditor;

public class StudentNameEditor extends PropertiesEditor{
	
	public void setAsText(String studentName) throws IllegalArgumentException{
	
		if(studentName.contains("Mr.") || studentName.contains("Ms.")) {
			
			setValue(studentName);
		}
		else {
			
			setValue("Mr. "+studentName);
		}
	}
}
