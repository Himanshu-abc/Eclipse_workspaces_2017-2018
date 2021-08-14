package prt;

import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeexample {

	public static void main(String[] args) {
	
		Deque<String> dq=new ArrayDeque<String>();
		
		dq.add("himanshu");
		dq.add("rubina");
		dq.add("aman");
		dq.add("xyz");
		
		for(String s:dq) {
			System.out.println(s);
		}
		
		System.out.println(dq.size());
		System.out.println(dq.peek());
		}
}
