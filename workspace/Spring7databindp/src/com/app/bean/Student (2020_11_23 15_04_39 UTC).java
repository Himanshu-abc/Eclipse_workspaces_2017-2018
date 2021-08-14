package com.app.bean;

public class Student {
	
	private String gender;
	private Integer roll;
	private String name;
	private String city;
	private Course course;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getRoll() {
		return roll;
	}
	public void setRoll(Integer roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [gender=" + gender + ", roll=" + roll + ", name=" + name + ", city=" + city + ", course="
				+ course + "]";
	}
}
