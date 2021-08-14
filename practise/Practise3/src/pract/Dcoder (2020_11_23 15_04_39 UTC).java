package pract;

import java.util.Scanner;

public class Dcoder {
	
	private int feet=0;
	private int inches=0;
	
    public void getDistance() {
    	
    	Scanner sc=new Scanner(System.in);
    	
    	System.out.println("enter feet");
    	feet=sc.nextInt();
    	
    	System.out.println("enter inches");
    	inches=sc.nextInt();
    }
    
    public void showDistance() {
    	System.out.println("feet "+feet+" inches "+inches);
    }
    
    public void adddistance(Dcoder d1,Dcoder d2) {
    	
    	inches=d1.inches+d2.inches;
    	
    	feet=d1.feet+d2.feet+(inches/12);
    	inches=inches%12;
    }

	public static void main(String[] args) {
		
		
		Dcoder d1=new Dcoder();
		Dcoder d2=new Dcoder();
		Dcoder d3=new Dcoder();
		
		d1.getDistance();
		d2.getDistance();
		
		d3.adddistance(d1, d2);
		d3.showDistance();
		
	}
}