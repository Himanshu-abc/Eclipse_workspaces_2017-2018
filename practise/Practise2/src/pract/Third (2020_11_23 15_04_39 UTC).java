package pract;

import java.util.Scanner;

public class Third {

	public double area(int radius) {
		
		return (Math.PI*radius*radius);
	}
	
	public double perimeter(int radius) {
		
		return (2*Math.PI*radius);
	}
	public static void main(String[] args) {
	
		Third t=new Third();
		Scanner sc=new Scanner(System.in);
		int radius=sc.nextInt();
		
		double a=t.area(radius);
		double p=t.perimeter(radius);
		
		System.out.println(a);
		System.out.println(p);
		}
}
