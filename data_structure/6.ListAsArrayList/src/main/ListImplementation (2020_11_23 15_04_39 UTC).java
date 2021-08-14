package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListImplementation {

	public static void main(String[] args) {
		
		List<String> listSubject = new ArrayList<String>();
		
		listSubject.add("c");
		listSubject.add("c++");
		listSubject.add("java");
		
		
		List<String> list2=new ArrayList<String>();
		
		list2.add("HTML");
		list2.add("CSS");
		list2.add("JS");
		
		listSubject.addAll(1, list2);
		
		//print method 1    enhanced for loop
		/*for(String item : listSubject){
			System.out.println(item);
		}*/
		
		//print method 2      simple for loop
		/*int size=listSubject.size();

		for(int i=0;i<size;i++) {
			System.out.println(listSubject.get(i));
		}*/
		
		//print method 3      iterative method
		Iterator<String> it=listSubject.listIterator();
		while(it.hasNext()) {
			String item =it.next();
			System.out.println(item);
		}
		
		String searchItem="c++";
		int index = listSubject.indexOf(searchItem);
		System.out.println("index of "+ searchItem+" is "+ index);
		
		System.out.println("------------");
		
		List<String> sub=listSubject.subList(2, 5);
	    it=sub.listIterator();
	    while(it.hasNext()) {
	    	System.out.println(it.next());
	    }
	}
}
