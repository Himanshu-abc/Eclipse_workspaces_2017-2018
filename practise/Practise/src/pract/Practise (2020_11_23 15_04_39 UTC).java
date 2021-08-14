package pract;

import java.util.Scanner;

public class Practise {

	public static void main(String [] args) {
		
		System.out.println("enter the number of rows");
		Scanner sc=new Scanner(System.in);
		
		int line=sc.nextInt();
		
		for(int i=0;i<line;i++) 
		{
			for(int j=i;j<line-1;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<(2*i)+1;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=1;a<=line-1;a++) 
		{
			for(int b=0;b<a;b++)	{
				System.out.print(" ");
			}
			
			for(int c=0;c<2*(line-a)-1;c++) {
			System.out.print("*");
			}
			System.out.println();
		}
	}
	}