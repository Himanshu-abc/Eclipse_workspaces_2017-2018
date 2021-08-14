import java.util.Scanner;

public class RandomG{

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length of string");
		
		int size=sc.nextInt();
		
	    final String sx="abcdefghijklmnopqrstuvwxyz0123456789";
	    
	    StringBuilder sb=new StringBuilder();
	    
	    for(int i=0;i<size;i++) {
	    	
	    int j=(int)(Math.random()*sx.length());
	    sb.append(sx.charAt(j));
	    }
	    
	    System.out.println(sb.toString());
		
	}
}
