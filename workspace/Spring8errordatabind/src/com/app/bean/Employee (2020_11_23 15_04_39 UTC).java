package com.app.bean;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Employee {
	private Integer empid;
	private String name;
	private String[] hobbies;
	private List<String> qualifications;
	private String gender;
	private City city;
	private Double salary;
	private Date joinDate;
	
	
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public List<String> getQualifications() {
		return qualifications;
	}
	public void setQualifications(List<String> qualifications) {
		this.qualifications = qualifications;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", hobbies=" + Arrays.toString(hobbies)
				+ ", qualifications=" + qualifications + ", gender=" + gender + ", city=" + city + ", salary=" + salary
				+ ", joinDate=" + joinDate + "]";
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
	
	
	
	
}
