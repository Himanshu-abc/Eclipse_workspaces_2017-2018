package main;

public class CircularDoublyLinkedList {
	
	private class node{
		
		int data;
		node prev;
		node next;
		
		public node(int data) {
			this.data=data;
		}
	}
	
	private node head;
	private node dllist;
	private int count;
	
    CircularDoublyLinkedList() {
		count=0;
	}
	
	public void addNode(int data) {
		
		node newNode=new node(data);
		
		if(count==0) {
			dllist=newNode;
			dllist.next=dllist;
			dllist.prev=dllist;
			head=dllist;
		}
		else {
		
			newNode.prev=dllist.prev;
			newNode.next=dllist;
			dllist.prev.next=newNode;
			dllist.prev=newNode;
			
			head=dllist;
		}
		count++;
	}
	
	public void print() {
		if(count==0) {
			System.out.println("empty list");
			return;
		}
		node current=head;
		do {
			System.out.println(current.data);
			current=current.next;
		}
		while(current!=head);
	}
	
	public void insert(int position , int data) {
		if(position>count) {
			System.out.println("position is out of index" );
			return;
		}
		node newnode=new node(data);
		node current=head;
		int i=0;
		while(i < position) {
			i++;
			current=current.next;
		}
		newnode.prev=current.prev;
		newnode.next=current;
		current.prev.next=newnode;
		count++;
	}
	
	public void delete(int index) {
		if(index>count) {
			System.out.println("out of index ");
			return;	
		}
		node current =head;
		int i=0;
		while(i < index) {
			i++;
			current=current.next;
		}
		current.prev.next=current.next;
		current.next.prev=current.prev;
		count--;
	}
	
}