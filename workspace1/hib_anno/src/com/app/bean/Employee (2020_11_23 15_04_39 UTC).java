package com.app.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp22")
public class Employee {
	
	@Id
	@Column(name="id",length=38,nullable=false,unique=true,updatable=false)
	private int id;
	
	@Column(name="name",insertable=true,nullable=false,updatable=true)
	private String name;
	
	@Column(name="pass",insertable=true,nullable=false,updatable=true)
	private String pass;
	
	@Column(name="num",length=38)
	private int num;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}