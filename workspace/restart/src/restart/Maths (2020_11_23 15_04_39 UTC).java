package restart;

import java.util.Scanner;

public class Maths {
	
	public static void main (String [] args){
		
		Employee e1 = new Employee();
		
		Employee e2 = new Employee("Ram");
		
		Scanner sv = new Scanner(System.in);
		
		System.out.println("Please Enter age , gender, name, salary ");
		
		int a = sv.nextInt();
		String st1 = sv.next();
		String st2 = sv.next();
		double d1= sv.nextDouble();
		sv.close();
		
		e1.setAge(a);
		e1.setGender("st1");
		e1.setName("st2");
		e1.setSalary(d1);
		
		if(e1.getAge()>34)
		System.out.println(e1.getSalary());
		else
		{
		System.out.println("intruders");	
		}
		
		
	}
	
	
}

