package com.app.entity;

import org.springframework.stereotype.Component;

@Component
public class School {
	
	private String name;
	private int Code;
	private int students;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	public int getStudents() {
		return students;
	}
	public void setStudents(int students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", Code=" + Code + ", students=" + students + "]";
	}
}