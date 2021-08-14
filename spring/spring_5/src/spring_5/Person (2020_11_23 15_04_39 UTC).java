package spring_5;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	
	private String name;
	private List<String> friends;
	private Set<String> emails;
	private Map<String, Double> accounts;
	private Properties education;
	private List<Car> cars;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Set<String> getEmails() {
		return emails;
	}
	public void setEmails(Set<String> emails) {
		this.emails = emails;
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
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	public void show() {
		System.out.println(name);
		System.out.println(friends);
		System.out.println(emails);
		System.out.println(accounts);
		System.out.println(education);
		System.out.println(cars);
	}
}