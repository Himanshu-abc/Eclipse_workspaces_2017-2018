package com.pp.entity;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="stu_table")
public class Student {
	@Id
	@GeneratedValue
	private int sid;

	@Column(name="sname",length=50)
	private String name;

	@Column(name="course_name",length=50)
	private String course;

	private double fees;

	@Temporal(TemporalType.DATE)
	@Column(name="ad_date")
	private Date adDate;
	



public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public double getFees() {
	return fees;
}
public void setFees(double fees) {
	this.fees = fees;
}
public Date getAdDate() {
	return adDate;
}
public void setAdDate(Date adDate) {
	this.adDate = adDate;
}



}
