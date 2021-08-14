package pract;

import java.util.Scanner;

public class Practise3 {

	public static void main(String[] args) {
	
		System.out.println("enter the number of rows");
		
		Scanner sc=new Scanner(System.in);
		int rows=sc.nextInt();
		
		for(int i=0;i<rows;i++) {
			
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			for(int k=1;k<rows-i;k++) {
				System.out.print(" ");
			}
			for(int l=0;l<=rows-i;l++) {
				System.out.print("*");
			}
			for(int m=0;m<(2*i);m++) {
				System.out.print(" ");
			}
			for(int n=0;n<rows-i;n++) {
				System.out.print("*");
			}
			for(int o=1;o<rows-i;o++) {
				System.out.print(" ");
			}
			for(int p=0;p<i+1;p++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}