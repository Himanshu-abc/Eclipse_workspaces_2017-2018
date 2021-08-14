package pract;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Practise10 {
	
	public static String reverse(String s) {
		
	int l=s.length();
	String rev="";
	for(int i=0;i<l;i++) {
		if(i==0) {
			rev=rev+s.charAt(l-1);
		}
		else if (i==l-1) {
		    rev=rev+s.charAt(0);	
		}
		else {
			rev=rev+s.charAt(i);
		}
	}
	return rev;
	}

	public static void main(String[] args) {
	
		System.out.println("enter a string");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		StringTokenizer st=new StringTokenizer(s,"!?! ");
		
		int w=st.countTokens();
		String token[]=new String[w];
		
		for(int i=0;i<w;i++) {
			token[i]=st.nextToken();
		}
		
		for(int i=0;i<w;i++) {
			System.out.print(reverse(token[i])+" ");
		}
	}
}
