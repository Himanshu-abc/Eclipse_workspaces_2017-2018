package pract;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Practise19 {
	
	public static String getResolution() {
		
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		
		double height=d.getHeight();
		double width=d.getWidth();
		
		String s=width +" X "+height;
		return s;
	}

	public static void main(String[] args) {
		
		//print resolution of a system
		System.out.println("resolution is "+getResolution());
		
	}
}