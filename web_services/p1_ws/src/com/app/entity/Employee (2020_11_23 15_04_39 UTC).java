package com.app.entity;

import java.util.Arrays;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(value="department")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Employee {
	
	@JsonProperty(value="Employee_Name")
	@NotEmpty
	private String name;
	
	@NonNull
	@Size(min=22,max=100)
	private Integer age;
	private String gender;
	private String[] hobbies;
	private String department;
	private Double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String  getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getDepartment() {
		return department;
	}
	public Employee() {
		super();
	}
	public Employee(String name, Integer age, String gender, String[] hobbies, String department, Double salary) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.hobbies = hobbies;
		this.department = department;
		this.salary = salary;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender + ", hobbies="
				+ Arrays.toString(hobbies) + ", department=" + department + ", salary=" + salary + "]";
	}
	
}