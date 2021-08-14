package practise4;

import java.util.Scanner;

public class Pone {

	public static void main(String[] args) {

		//calculator
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		do {
			System.out.println("Main Menu");
			System.out.println("enter 1 for addition");
			System.out.println("enter 2 for subtraction");
			System.out.println("enter 3 for multiplication");
			System.out.println("enter 4 for division");
			System.out.println("enter 5 for exit");
			
			System.out.println("enter 2 numbers");
			System.out.println("enter first number ");
			int n1=sc.nextInt();
			System.out.println("enter second number ");
			int n2=sc.nextInt();
			System.out.println("enter operation code");
		    choice=sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("addition of number is "+(n1+n2));
				break;
				
			case 2:
				System.out.println("subtraction of number is "+(n1-n2));
				break;
			
			case 3:
				System.out.println("multiplication of number is "+(n1*n2));
				break;
				
			case 4:
				System.out.println("division of number is "+n1/n2);
				break;

			case 5:
				System.exit(0);
				
			default:
				System.out.println("invalid choice please enter again");
				break;
			}
		}while(choice!=5);
	}
}