package practise4;

import java.util.Scanner;

public class Pfive {

	public static void main(String[] args) {
    // make 1 letter capital in each String
		
	String s="hello my name is ravi kumar";
	
	Scanner sc=new Scanner(s);
	
	while(sc.hasNext()) {
		
		String s1=sc.next();
		s1=Character.toUpperCase(s1.charAt(0))+s1.substring(1);
		System.out.print(s1+" ");
	}
	
	}
	}