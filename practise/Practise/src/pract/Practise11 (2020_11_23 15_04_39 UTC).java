package pract;

import java.util.InputMismatchException;
import java.util.Scanner;

class StudentManagement extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StudentManagement(String error) {
	  super(error);
	}
}

public class Practise11 {

	public static void main(String[] args) {
	
		try {
			Scanner sc=new Scanner(System.in);
			
			int marks=sc.nextInt();
			
			if(marks<=0 || marks>=100) {
				throw new StudentManagement("invalid marks "+marks);
			}
			System.out.println("entered marks are "+marks);
			
		}
		catch (InputMismatchException ime) {
			System.out.println(ime);
		}
		
		catch ( StudentManagement sm) {
			sm.printStackTrace();
		}
	}
}