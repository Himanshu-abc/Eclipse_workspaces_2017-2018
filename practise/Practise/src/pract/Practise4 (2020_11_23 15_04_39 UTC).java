package pract;

import java.util.Scanner;

public class Practise4 {

	public static void main(String[] args) {
	
		// spiral pattern
		
		System.out.println("enter the number of elments for pattern");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int arr[][]=new int[n][n];
		int k=1,c1=0,c2=n-1,r1=0,r2=n-1;
		
	    while(k<=n*n) 
	    {
	    	for(int i=c1;i<=c2;i++) {
	    		arr[r1][i]=k++;
	    	}
	    	
	    	for(int j=r1+1;j<=r2;j++) {
	    		arr[j][c2]=k++;
	    	}
	    	
	        for(int i=c2-1;i>=c1;i--) {
	        	arr[r2][i]=k++;
	        }
	        
	        for(int j=r2-1;j>=r1+1;j--) {
	        	arr[j][c1]=k++;
	        }
	        
	        c1++;
	        c2--;
	        r1++;
	        r2--;
	    }
	    
	    System.out.println("the spiral pattern is ");
	    
	    for(int a=0;a<n;a++) {
	    	
	    	for(int b=0;b<n;b++) {
	    		System.out.print(arr[a][b]+"\t");
	    	}
	    	System.out.println();
	    }
	}
}
