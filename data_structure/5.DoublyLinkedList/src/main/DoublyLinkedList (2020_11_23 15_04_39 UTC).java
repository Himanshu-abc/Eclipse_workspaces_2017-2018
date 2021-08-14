package main;

public class DoublyLinkedList {

	private int size;
	private Link head;
	
	public DoublyLinkedList() {
		head=null;
		size=0;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addFront(int data) {
		if(head==null) {
			head=new Link(null, data, null);
		}
		else {
			Link link=new Link(null, data, head);
			link.next = head;
			head=link;
		}
		size++;
	}
	
	public void addRear(int data) {
		if(head==null) {
			head=new Link(null, data, null);
		}
		else {
			Link current=head;
			while(current.next!=null) {
			current=current.next;
			}
			Link newLink=new Link(current, data, null);
			current.next=newLink;
		}
		size++;
	}
	
	public int size() {
		return size;
	}
	
	public void removeFront() {
		if(head==null) return;
		
		head=head.next;
		head.previous=null;
		size--;
	}
	
	public void removeRear() {
		if(head==null) return;
		
		Link current=head;
		while (current.next.next!=null) {
			current=current.next;
		}
		current.next=null;
		size--;
	}
	   
	public void insertAt(int data , int index) {
		
		if(head==null) return ;
		if(index < 1  || index > size) return;
		
		Link current = head;
		int i=1;
		
		while(i < index) {
			current = current.next;
			i++;
		}
		if(current.previous == null) {                    // for index 1 i.e, head
			Link newLink = new Link(null, data, current);
			current.previous = newLink;
			head = newLink;
		}
		else {
			Link newLink=new Link(current.previous,data,current);
			current.previous.next=newLink;
			current.previous=newLink;
		}
		size++;
	}
	
	public void removeAt(int index) {
	
		if(head == null) return;
		if(index < 1 || index > size) return;
		
		Link current = head;
		int i=1;
		while(i < index) {
			current = current.next;
			i++;
		}
		if(current.next==null) {          //   last link
			current.previous.next=null;
		}
		else if (current.previous==null) {     // first link
		    current=current.next;
		    current.previous=null;
		    head=current;
		}
		else {
			current.previous.next=current.next;
			current.next.previous=current.previous;
		}
		size--;
	}
	
	public void print() {
		Link current=head;
		while(current != null) {
			System.out.println(current.getData());
			current=current.next;
		}
	}
	
	public static void main(String[] args) {	
		
		DoublyLinkedList dll=new DoublyLinkedList();
		System.out.println(dll.isEmpty());
		dll.addFront(5);
		dll.addFront(20);
		dll.print();
		System.out.println("------------");
		dll.addRear(10);
		dll.print();
		System.out.println("------------");
		dll.insertAt(36, 1);
		dll.insertAt(28, 4);
		dll.print();
		System.out.println("size is "+dll.size());
		System.out.println("------------");
		dll.removeAt(3);
		dll.print();
		System.out.println("size is "+dll.size());
	}
}