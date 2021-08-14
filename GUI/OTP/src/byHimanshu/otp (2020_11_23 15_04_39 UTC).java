package byHimanshu;

import java.util.Random;

public class otp {

	public static void main(String[] args) {
	
		// 1 method to generate random numbers
		Random r=new Random(999999);
		for(int i=0;i<10;i++) {
		System.out.println(r.nextInt());
		}
		
		 System.out.println("--------------");
		
		// method 2 to generate random number
	    for(int i=0;i<10;i++) {
		System.out.println(Math.random());
	}
}
}