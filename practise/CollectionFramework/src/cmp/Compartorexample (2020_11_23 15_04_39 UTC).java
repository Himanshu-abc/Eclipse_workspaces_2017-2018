package cmp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compartorexample {

	public static void main(String[] args) {
	
		Employee e1=new Employee(1, "himanshu", 23, 26000);
		Employee e2=new Employee(5, "uma", 25,10000);
		Employee e3=new Employee(2, "raja", 29, 50000);
		
		List<Employee> l=new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		for(Employee ee:l) {
			System.out.println(ee.id+" "+ee.name+" "+ee.age);
		}
		System.out.println("-----------------");
		
		Collections.sort(l, new Idcomp());
		for(Employee ee:l) {
			System.out.println(ee.id+" "+ee.name+" "+ee.age);
		}
		System.out.println("-----------------");
		
		Collections.sort(l,new Namecmp());
		for(Employee ee:l) {
			System.out.println(ee.id+" "+ee.name+" "+ee.age);
		}
	}
}