package com.anno;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="student_data")
public class Students {
	
	@Id
	@GeneratedValue
	private int roll_no;
	
	@Column(name="fname",length=50)
    private String first_name;
	
	@Column(name="lname",length=50)
    private  String last_name;
	
	@Column(name="course")
    private String course;
	
	@Temporal(TemporalType.DATE)
	@Column(name="ad_date")
    private Date ad_date;
	
	@Column(name="age")
    private int age;
	
	@Column(name="city")
    private String city;

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Date getAd_date() {
		return ad_date;
	}

	public void setAd_date(Date ad_date) {
		this.ad_date = ad_date;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	}
	
   
    

