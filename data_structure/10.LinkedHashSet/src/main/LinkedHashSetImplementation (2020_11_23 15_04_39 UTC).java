package main;

import java.util.Iterator;
import java.util.LinkedHashSet;

class Employee{
	
	private int id;
	private String name;
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {	
		return "id : "+id+" name : "+name;
	}
}

public class LinkedHashSetImplementation {
		
	public static void main(String[] args) {
	
	LinkedHashSet<Employee> lhs=new LinkedHashSet<Employee>();
	
	lhs.add(new Employee(5, "chris"));
	lhs.add(new Employee(10, "smith"));
	lhs.add(new Employee(15, "olga"));
	lhs.add(new Employee(20, "katia"));
	
	Iterator<Employee> it=lhs.iterator();
	
	while(it.hasNext()) {
		System.out.println(it.next());
		System.out.println(it.hashCode());
	}
	}
}
