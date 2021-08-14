package practise4;

import java.util.Scanner;

public class Ptwo {

	public static void main(String[] args) {

		// prime numbers between a given range
		System.out.println("enter the maximum and minimum range");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("min range");
		int n1=sc.nextInt();
	    System.out.println("max range");
		int n2=sc.nextInt();
		int count=0,count1=0;
		
		for(int i=n1;i<=n2;i++) {
			
			for(int j=2;j<i;j++) {
				
				if(i%j==0) {
					count=0;
					break;
				}
				else {
					count=1;
				}
			}
			
			if(count==1) {
				System.out.print(i+" ");
			    count1++;
			}
		}
		System.out.println("no. of prime numbers in the range "+count1);
	}
}
