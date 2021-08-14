package pract;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Practise15 {

	// program to swap first ad last character in string
	
	public static String reverseWords(String st) {
		
		int l=st.length();
		String rev="";
		
		for(int i=0;i<l;i++) {
		    
			if(i==0) {
		    	rev=rev+st.charAt(l-1);
		    }
			else if (i==l-1) {
				rev=rev+st.charAt(0);
			}
			else {
				rev=rev+st.charAt(i);
			}
		}
		return rev;
    }
	
	public static void main(String[] args) {
		
		System.out.println("enter a String");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		StringTokenizer st=new StringTokenizer(s, "!?! ");
		int w=st.countTokens();
		String arr[]=new String[w];
		
		for(int i=0;i<w;i++) {
		arr[i]=st.nextToken();
		}
		
		for(int i=0;i<w;i++) {
			System.out.print(reverseWords(arr[i])+" ");
		}
	}
}