package main;

public class CircularDoublyLinkedListImplementation {

	public static void main(String[] args) {
	
		CircularDoublyLinkedList list=new CircularDoublyLinkedList();
		list.addNode(55);
		list.addNode(17);
		list.addNode(99);
		list.insert(1, 100);
		list.delete(3);
		list.print();
	}
}
