package com.app.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="student")
public class Student {
	
	@Id @GeneratedValue 
	private int id;
	
	@Column(name="name",length=50,unique=false,nullable=false,insertable=true,updatable=true)
	private String name;
	
	@Column(name="course",length=100,unique=false)
	private String Course;
	
	@Column(name="fees",columnDefinition="double",nullable=false)
	private double fees;
	
	@Temporal(TemporalType.DATE)
	@Column(name="date",nullable=false)
	private Date date;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Course=" + Course + ", fees=" + fees + ", date=" + date
				+ "]";
	}
}