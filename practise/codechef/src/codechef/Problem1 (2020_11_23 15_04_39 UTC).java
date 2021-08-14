package codechef;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem1 {
	
	static void answer(String s,String e,int l,int r) {
		
		Map<String, Integer> map=new HashMap<>();
		map.put("monday", 1);
		map.put("tuesday", 2);
		map.put("wednesday", 3);
		map.put("thrusday", 4);
		map.put("friday", 5);
		map.put("saturday", 6);
		map.put("sunday", 7);
		
		int sdy=map.get(s);
		int edy=map.get(e);
		int tdy=0;
		
		if(sdy>edy)
	    tdy=(edy-sdy)+1;
		
		else
		tdy=(sdy-edy)+1;
		
		if(tdy<l || tdy>r) {
			System.out.println("impossible");
		}
		else if(r<7 && tdy>=l && tdy<=r) {
			System.out.println(tdy);
		}
		else {
			System.out.println("many");
		}
	}	
	
	public static void main(String [] args) {
	
	Scanner sc=new Scanner(System.in);
	
	// no. of test cases
	int t=sc.nextInt();
	
	for(int i=0;i<t;i++) {
		
		String s=sc.next();
		String e=sc.next();
		int l=sc.nextInt();
		int r=sc.nextInt();
		
		answer(s, e, l, r);
	}
	
	
}
}
