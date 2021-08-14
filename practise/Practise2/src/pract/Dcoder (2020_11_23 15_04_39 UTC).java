package pract;

import java.util.Scanner;

public class Dcoder {
	
	public int countDigits(int n) {
		
		int count=0;
		while(n!=0) {
			n/=10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    Dcoder d=new Dcoder();
	    int c=d.countDigits(n);
	    System.out.println(c);
	}
}
