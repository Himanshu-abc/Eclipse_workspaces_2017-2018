package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImplementation {

	public static void main(String[] args) {
	
		LinkedList<String> llist=new LinkedList<String>();
		
		llist.add("c");
		llist.add("c++");
		llist.add("java");
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("HTML");
		al.add("CSS");
		al.add("JS");
		
		llist.addAll(al);
		
		boolean isEXist=llist.contains("c++");
		System.out.println(isEXist);
		
		
		//another method to print
		/*int size=llist.size();
		for(int i=0;i<size;i++) {
		System.out.println(llist.get(i));	
		}*/
		
		Iterator<String> it=llist.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}