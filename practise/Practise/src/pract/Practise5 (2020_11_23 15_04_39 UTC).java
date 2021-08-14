package pract;

import java.util.Scanner;

public class Practise5 {

	public static void main(String[] args) {
		
	System.out.println("enter the no. of lines");
	
	Scanner sc=new Scanner(System.in);
	
	int line=sc.nextInt();
	int n=1;
	
	for(int i=0;i<line;i++)
	{
		
		for(int k=0;k<i;k++) {
			System.out.print(" ");
		}
		
		for(int j=n;j<=line;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
		++n;
	}
	
	for(int i=line-1;i>0;i--) {
		
		for(int j=0;j<i-1;j++) {
			System.out.print(" ");
		}
		for(int k=i;k<=line;k++) {
			System.out.print(k+" ");
		}
		System.out.println();
	}
	}
}
