package main;

public class LinkedList {
	
	private Link head;
	
	public LinkedList() {
		head=null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void insert(int data) {
		Link link=new Link(data);
		link.next=head;
		head=link;
	}
	
	public boolean delete() {
		if(head==null)
			return false;
		
		head=head.next;
		return true;
	}
	
	public void print() {
		
		Link current=head;
		while(current!=null)
		{
			System.out.println(current.getData());
			current=current.next;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedList list=new LinkedList();
		list.insert(17);
		list.insert(22);
		list.insert(23);
		list.print();
		list.delete();
		System.out.println("---------");
		list.print();
	}
}