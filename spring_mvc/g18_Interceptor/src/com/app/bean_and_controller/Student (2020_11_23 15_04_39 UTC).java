package com.app.bean_and_controller;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	
	private String name;
	
	@Size(min=4, max=10)
	private String hobby;
	
	private long mobileNumber;
	
	private Date DOB;
	
	@NotEmpty
	private List<String> skills;
	
    private Address studentAddress; 
	
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
}
