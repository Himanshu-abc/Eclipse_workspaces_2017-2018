package com.app.entity;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {

	@NotNull
	@Pattern(regexp="[0-9]*")
	private String name;
	
	@Size(min=4,max=10)
	private String hobby;
	
	@Size(max=10)
	private long mobileNumber;
	private Date date;
	private List<String> skills;
	private Address studentAddess;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	public Address getStudentAddess() {
		return studentAddess;
	}
	public void setStudentAddess(Address studentAddess) {
		this.studentAddess = studentAddess;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", mobileNumber=" + mobileNumber + ", date=" + date + ", hobby=" + hobby
				+ ", skills=" + skills + ", studentAddess=" + studentAddess + "]";
	}
}