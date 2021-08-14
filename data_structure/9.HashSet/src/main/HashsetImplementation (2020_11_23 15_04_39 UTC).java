package main;

import java.util.HashSet;
import java.util.Iterator;

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

public class HashsetImplementation {

	public static void main(String[] args) {
		
		HashSet<Employee> hs=new HashSet<Employee>();
		hs.add(new Employee(1, "roxy"));
		hs.add(new Employee(2, "lexi"));
		hs.add(new Employee(3, "weber"));
		hs.add(new Employee(4, "olive"));
		
		Iterator<Employee> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			System.out.println("hash code "+it.hashCode());
		}
	}
}
