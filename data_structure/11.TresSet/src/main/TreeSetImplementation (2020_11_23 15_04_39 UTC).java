package main;

import java.util.Iterator;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {	
		return "id : "+id+", name : "+name;
	}

	@Override
	public int compareTo(Employee e) {
		return id - e.id;
	}
}

public class TreeSetImplementation {

	public static void main(String[] args) {
	
		TreeSet<Employee>ts=new TreeSet<Employee>();
		
		ts.add(new Employee(15, "roxy"));
		ts.add(new Employee(55, "mike"));
		ts.add(new Employee(40,"chris"));
		ts.add(new Employee(100, "lexi"));
		ts.add(new Employee(25, "Steve_austin"));
		
		/*ts.add(15);
		ts.add(55);
		ts.add(40);
		ts.add(100);
		ts.add(25);*/
		
		Iterator<Employee> it = ts.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}