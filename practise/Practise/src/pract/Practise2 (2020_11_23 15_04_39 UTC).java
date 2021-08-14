package pract;

import java.util.Scanner;

public class Practise2 {

	public static void main(String[] args) {
		
		System.out.println("enter the starting number");
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		
		System.out.println("enter the ending number");
		int num2=sc.nextInt();
		
		int count=0;
		
		for(int i=num1;i<=num2;i++) {
			
			int rem=0,temp=0,num;
			num=i;
			while(num!=0) {
				
				rem=num%10;
				temp=temp+rem*rem*rem;
				num=num/10;
			}
			
			if(i==temp) {
				
				if(count==0) {
					System.out.println("the armstrong numbers are as follow :");
				}
				System.out.print(i+" ");
				count++;
			}
		}
		if(count==0) {
			System.out.println("there are no armstrong numbers between these intervals");
		}
	}
}
