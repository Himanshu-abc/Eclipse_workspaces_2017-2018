package main;

public class MaxHeapImplementation {

	public static void main(String[] args) {
	
		MaxHeap max=new MaxHeap();
		
		max.insert(12);
		max.insert(7);
		max.insert(6);
		max.insert(8);
		max.insert(10);
		max.insert(20);
		
		max.print();
	}
}
