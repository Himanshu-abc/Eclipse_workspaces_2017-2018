package byHimanshu;

import java.util.Scanner;

public class Dcoder {
	
	public static <Y> double add(Y y,Y y1) {
	
    double d1=Double.parseDouble(y.toString());
    double d2=Double.parseDouble(y1.toString());
	  
    double d3=d1+d2;
	  return d3; 
	}
	
	public static <T> void print(T t) {
		System.out.println(t);
	}
	public static void print() {
		System.out.println();
	}
	
public static void main (String [] args) {
	
Scanner sc=new Scanner(System.in);

System.out.println("enter the size of matrix");  

int s=sc.nextInt();

int a[][]=new int[s][s];

int [][]b=new int[s][s];
int big=s+s;
int c[][]=new int[s][big];

System.out.println("enter the elemets of matrix 1");

for(int i=0;i<s;i++) {
	
	for(int j=0;j<s;j++) {
		
		a[i][j]=sc.nextInt();
	}
}
System.out.println("enter the elements of array 2");

for(int i=0;i<s;i++) {
	
	for(int j=0;j<s;j++) {
		
		b[i][j]=sc.nextInt();
	}
}

System.out.println("after combining thre two matrix");

for(int i=0;i<s;i++) {
	
	for(int j=0;j<s;j++) {
		
		c[i][j]=a[i][j];
		
		System.out.print(c[i][j]);
	}
	System.out.println();
}
for(int i=0;i<s;i++) {
	for(int j=s,k=0;j<big && k<s;k++,j++) {
		
	System.out.print(c[i][j]=b[i][k]);
}
}

}
}