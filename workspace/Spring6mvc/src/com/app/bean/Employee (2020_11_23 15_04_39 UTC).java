package com.app.bean;

import java.util.Arrays;

public class Employee {

private Integer empId;
private String name;
private String password;
private Double salary;
private String[] hobbies;



public Employee(Integer empId, String name, Double salary) {
	super();
	this.empId = empId;
	this.name = name;
	this.salary = salary;
}

public Employee(){}

public Integer getEmpId() {
	return empId;
}



public void setEmpId(Integer empId) {
	this.empId = empId;
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



public Double getSalary() {
	return salary;
}



public void setSalary(Double salary) {
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
	return "Employee [empId=" + empId + ", name=" + name + ", password=" + password + ", salary=" + salary
			+ ", hobbies=" + Arrays.toString(hobbies) + "]";
}



}
