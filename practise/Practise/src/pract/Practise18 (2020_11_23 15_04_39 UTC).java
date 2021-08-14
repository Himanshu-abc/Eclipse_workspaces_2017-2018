package pract;

import java.util.Scanner;

public class Practise18 {

	public static void main(String[] args) {
	
		// transpose a matrix
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter no. of rows");
		int r=sc.nextInt();
		
		System.out.println("enter no. columns");
		int c=sc.nextInt();
		
		int m[][]=new int[r][c];
		System.out.println("enter elements of matrix a ");
		
		for(int i=0;i<r;i++) {
			
			for(int j=0;j<c;j++) {
				
			m[i][j]=sc.nextInt();	
			}
		}
		System.out.println("matrix a");
		
        for(int i=0;i<r;i++) {
			
			for(int j=0;j<c;j++) {
				
				System.out.print(m[i][j]);
			}
			System.out.println();
		}
        
		System.out.println("transpose of matrix");
		
		for(int i=0;i<c;i++) {
			
			for(int j=0;j<r;j++) {
				
			   System.out.print(m[j][i]);
			}
			System.out.println();
		}
	}
}
