package main;

public class MinHeapImplementation {

	public static void main(String[] args) {
	
		MInHeap heap=new MInHeap();
		heap.insert(12);
		heap.insert(7);
		heap.insert(6);
		heap.insert(10);
		heap.insert(8);
		heap.insert(20);
		
		heap.print();
	}
}
