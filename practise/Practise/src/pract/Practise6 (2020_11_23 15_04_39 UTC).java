package pract;

import java.util.Scanner;

public class Practise6 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		
		int arr[]=new int[50];
		int i=0,temp=num;
		
		while(temp>0) {
			arr[i++]=temp % 2;
			temp/=2;
		}
		
		String b="";
		
		for(int j=i-1;j>=0;j--) 
		{
		b+=(arr[j]);
		}
		
		System.out.println("binary of "+num+" is "+b);
		
        int h = b.length()-1;
		
		while(b.charAt(h)=='0') 
		{
           h--;
		}
		int length = 0;
		int ctr = 0;
		for(;h>=0;h--) 
		{
			if(b.charAt(h)=='1')
			{
				length = Math.max(length, ctr);
				
				ctr = 0;
			} 
			else
			{
				ctr++;
			}
		}
		length = Math.max(length, ctr);
		System.out.println("\nLength of the longest sequence: "+length);
		}
	}

