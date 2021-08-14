package pract;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practise8 {
	
	static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
	
	public static boolean isPalindrome(String s) {
		
		String rev="";
		int length=s.length();
		for(int i=length-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(s.equals(rev))
			return true;
		else
		    return false;
	}

	public static void main(String[] args) {
	
		System.out.println("enter a string");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		s.toUpperCase();
		System.out.println(s);
		StringTokenizer st=new StringTokenizer(s,"!?! ");
		int t=st.countTokens();
		
		String token[]=new String[t];
		
		for(int i=0;i<t;i++) {
			token[i]=st.nextToken();
		}
		
		int count=0;
		
		for(int j=0;j<t;j++) {
			
			if(isPalindrome(token[j])==true) {
				count++;
				System.out.println(token[j]+" ");
			}
		}
		if(count==0) {
			System.out.println("no palindrome words");
		}
		else {
			System.out.println(count+" palindrome words");
		}
		}
	}
