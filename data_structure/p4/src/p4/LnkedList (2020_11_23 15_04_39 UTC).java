package p4;

public class LnkedList {
	
	private Link head;
	private int size;

	public LnkedList() {
		head=null;
		size=0;
	}
	
	public void insert(int data) {
		if(head==null) {
			head = new Link(data);
		}
		else {
			Link l=new Link(data);
			l.next=head;
			head=l;
		}
	}
	
	public void print() {
		Link current=head;
		
		while(current!=null) {
			System.out.print(current.getData()+" ");
			current=current.next;
		}
	}
	
	public int size() {
		
		Link current=head;
		int count=0;
		
		while(current!=null) {
			current=current.next;
			++count;
		}
		
		return count;
	}
	
}
