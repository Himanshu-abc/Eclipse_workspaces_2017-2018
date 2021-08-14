package main;

public class Main {

	public static void main(String[] args) {
		
		CircularArray ca=new CircularArray();
		
		ca.enqueue(5);
		ca.enqueue(10);
		ca.enqueue(15);
		ca.enqueue(20);
		/*System.out.println(ca.dequeue());
		System.out.println(ca.dequeue());*/
		
		while(!ca.isEmpty()) {
			System.out.println(ca.dequeue());
		}
	}
}
