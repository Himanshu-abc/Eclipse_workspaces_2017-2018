package pract;

import java.util.Scanner;

public class Practise9 {

	public static void main(String[] args) {
	
		System.out.println("enter the amount");
		Scanner sc=new Scanner(System.in);
		
		int rupee=sc.nextInt();
		int temp1=0,temp2=0,temp3=0,temp4=0,rem1=0,rem2=0,rem3=0,rem4=0;
		
		if(rupee>999) {
			rem1=rupee%1000;
			temp1=rupee/1000;  }
		
			if(rem1>99) {
				rem2=rem1%100;
				temp2=rem1/100;  }
			
				if(rem2>9) {
					rem3=rem2%10;
					temp3=rem2/10;  }
				
					if(rem3>0) {
						rem4=rem3%1;
						temp4=rem3/1;  }
											
		System.out.println("1000 rupees note "+temp1);
		System.out.println("100 rupees note "+temp2);
		System.out.println("10 rupees note "+temp3);
		System.out.println("1 rupee note "+temp4);
	}
}
