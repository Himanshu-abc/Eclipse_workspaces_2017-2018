package prt;

import java.util.PriorityQueue;

public class Priortyqueu {

	public static void main(String[] args) {
		
     PriorityQueue<String> pq=new PriorityQueue<>();
     
     pq.add("vijay");
     pq.add("ajay");
     pq.add("shamsher");
     pq.add("nehar");
     pq.add("ruby");
     
     /*Iterator<String> it=pq.iterator();
     while(it.hasNext()) {
    	 System.out.println(it.next());
     }*/
     
     System.out.println(pq.isEmpty());
     System.out.println(pq.size());
     System.out.println(pq.peek());
     System.out.println(pq.element());
	}
}
