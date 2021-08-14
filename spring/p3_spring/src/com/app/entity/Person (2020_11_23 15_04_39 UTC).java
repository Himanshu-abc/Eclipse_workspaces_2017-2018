package com.app.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private String name;
	private List<String> friends;
	private List<String> Emails;
	private Map<String,Double> accounts;
	private Properties education;
	private List<Car> car;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> names) {
		this.friends = names;
	}
	public List<String> getEmails() {
		return Emails;
	}
	public void setEmails(List<String> emails) {
		Emails = emails;
	}
	public Map<String, Double> getAccounts() {
		return accounts;
	}
	public void setAccounts(Map<String, Double> accounts) {
		this.accounts = accounts;
	}
	public Properties getEducation() {
		return education;
	}
	public void setEducation(Properties education) {
		this.education = education;
	}
	public List<Car> getCar() {
		return car;
	}
	public void setCar(List<Car> car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", friends=" + friends + ", Emails=" + Emails + ", accounts=" + accounts
				+ ", education=" + education + ", car=" + car + "]";
	}
}
