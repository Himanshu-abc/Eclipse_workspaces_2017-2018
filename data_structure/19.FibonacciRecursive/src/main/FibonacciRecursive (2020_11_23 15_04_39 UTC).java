package main;

public class FibonacciRecursive {
	
	public static int Fibo(int n) {
		if(n==1 || n==2) {
			return 1;
		}
			return Fibo(n-1)+Fibo(n-2);
	}

	public static void main(String[] args) {
		
		int n=5;
		System.out.println(Fibo(n));
	}
}
