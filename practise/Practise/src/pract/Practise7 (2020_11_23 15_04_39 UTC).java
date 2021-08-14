package pract;

import java.util.Scanner;

public class Practise7 {
	
	public static void main(String[] args) {
	
		System.out.println("enter a number");
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int count=0;
		// check prime number
		for(int i=2;i<n;i++) {
			
			if(n%i == 0)	{
				
			count=1;
			break;
			}
		}
		// reverse the number
		int temp=0,rem=0,rev=0;
		
		if(count==0) {
			
			temp=n;
			while(temp!=0)
			{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
			
			}
			System.out.println(rev);
			
			for(int i=2;i<rev;i++) {
				
				if(rev%i ==0) {
					
					count=1;
					break;
				}
				else {
					count=0;
				}
			}
		}
		if(count==0) {
			System.out.println(n+" is emrip number");
		}
		else {
			System.out.println(n+" is not emrip number");
		}
		}
		}