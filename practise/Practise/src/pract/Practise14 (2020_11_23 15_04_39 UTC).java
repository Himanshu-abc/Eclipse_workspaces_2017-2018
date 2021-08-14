package pract;

import java.util.Scanner;

public class Practise14 {
	
	public static int isPrime(int n) {
		
		int x=0;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				x=1;
				break;
			}
			else {
				x=0;
			}
		}
		return x;
	}
	
	public static void main(String [] args) {
		
		//emrip number
		
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int temp=n,rem=0,rev=0;
		
		if(isPrime(n)==0) {
			
			while(temp!=0){
				
				rem=temp%10;
				rev=rev*10+rem;
				temp/=10;
			}
		}
		else {
			System.out.println("not ugly number");
			System.exit(1);
		}
		System.out.println(rev);
		
		if(isPrime(rev)==0) {
			System.out.println("ugly number");
		}
		}
}