package com.app.bean;

import java.util.Arrays;
import java.util.List;

public class Employee {
	
	private int empid;
	private String name;
	private String password;
	private double salary;
	private String[] hobbies;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", password=" + password + ", salary=" + salary
				+ ", hobbies=" + Arrays.toString(hobbies) + "]";
	}
	
}
