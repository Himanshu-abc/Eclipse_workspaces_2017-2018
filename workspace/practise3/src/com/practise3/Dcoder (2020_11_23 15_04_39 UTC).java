package com.practise3;

import java.util.Scanner;

public class Dcoder {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elements for pattern");
		int n=sc.nextInt();
		sc.close();
		
		int [][] A=new int[n][n];
		int r1=0,c1=0,r2=n-1,c2=n-1,v=1;
		
		while(v<=n*n)
		{
			for(int i=c1;i<=c2;i++){
				A[r1][i]=v++;
			}
			for(int j=r1+1;j<=r2;j++){
				A[j][c2]=v++;
			}
		    for(int i=c2-1;i>=c1;i--){
		        A[r2][i]=v++;
		    }
		    for(int j=r2-1;j>=r1+1;j--){
		    	A[j][c1]=v++;
		    }
		    c1++;
		    c2--;
		    r1++;
		    r2--;
		} 
		System.out.println("Here is your sprial Pattern");
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(A[i][j]+ "\t");
			}
			System.out.println();
		}
	}
}
