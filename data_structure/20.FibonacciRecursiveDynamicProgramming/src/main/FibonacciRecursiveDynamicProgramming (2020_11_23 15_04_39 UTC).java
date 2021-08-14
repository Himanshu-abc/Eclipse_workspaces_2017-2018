package main;

public class FibonacciRecursiveDynamicProgramming {

	public static int Fibo(int[] f,int n) {
		if(f[n]<0) {
			if(n==1|| n==2) {
				f[n]=1;
			}
			else {
			return f[n]=Fibo(f, n-1)+Fibo(f, n-2);
			}
		}
		return f[n];
	}
	
	public static void main(String[] args) {
	
		int f[]=new int[50];
		for(int i=0;i<50;i++) {
			f[i]=-1;
		}
		System.out.println(Fibo(f, 5));
	}
}