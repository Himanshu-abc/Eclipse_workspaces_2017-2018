package com.work;

import java.util.Scanner;

public class Dcoder {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting value");
		int s=sc.nextInt();
		System.out.println("Enter the ending value");
		int e=sc.nextInt();
		sc.close();
		
		int	temp,n,count=0,rem,i;
		
		for(i=s+1;i<e;i++)
		{
		temp=i;
		n=0;
		while(temp!=0)
		{
		    rem=temp%10;
			n=n+rem*rem*rem;
			temp=temp/10;
		}
			if(i==n){
				if(count == 0){
					System.out.println("Armstrong No. are as follow");
				}
				System.out.println(i+ " ");
				count++;
			}
		}
		if(count==0){
			System.out.println("no Armstrong No. were found between these range");
		}
		}
	}

