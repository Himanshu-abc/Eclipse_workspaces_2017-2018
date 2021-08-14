package pract;

import java.awt.Dimension;
import java.awt.Toolkit;

public class First {

	public static void main(String[] args) {
	
	        System.out.println("resolution is "+getResolution());
	}
		public static String getResolution() {
			
			Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
			
			double height=d.getHeight();
			double width=d.getWidth();
			
			String s=width +" X "+height;
			return s;
		}
	}
