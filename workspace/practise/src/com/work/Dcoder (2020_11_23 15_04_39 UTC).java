package com.work;

import java.util.Scanner;

public class Dcoder {
	
	public static void main(String[] args){
		
		int a,b,c;
		System.out.println("Enter no. of rows");
		Scanner sc = new Scanner(System.in);
		int row =sc.nextInt();
		sc.close();
		
		for(a=0;a<row;a++){
			for(b=0;b<row-a-1;b++){
				System.out.print(" ");
			}
			for(c=0;c<a*2+1;c++){
				System.out.print("*");
			}
		System.out.println();	
		}
		for(a=row;a>0;a--){
			int r=row-a;
			for(b=0;b<=r;b++){
				System.out.print(" ");
			}
			for(c=0;c<2*a-3;c++){
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
