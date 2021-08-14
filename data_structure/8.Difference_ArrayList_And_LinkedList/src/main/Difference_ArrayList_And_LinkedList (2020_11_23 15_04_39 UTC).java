package main;

import java.util.ArrayList;
import java.util.LinkedList;

public class Difference_ArrayList_And_LinkedList {

	public static void main(String[] args) {
	
		LinkedList<Integer> ll =new LinkedList<Integer>();
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		long start=System.currentTimeMillis();
		
		/*for(int i=0 ; i< 1E6 ;i++) {
			ll.add(i);
		}*/
		
		for(int i=0 ; i< 1E6 ;i++) {
			ll.add(0,i);
		}
		long end=System.currentTimeMillis();
		
		System.out.println("total time taken by linked list "+(end-start));
		
		start=System.currentTimeMillis();
		
		/*for(int i=0 ; i< 1E6 ;i++) {
			al.add(i);
		}*/
		
		for(int i=0;i<1E6;i++) {
			al.add(0,i);
		}
		end=System.currentTimeMillis();
		
		System.out.println("total time taken array list "+(end-start));
	}
}
