package main;

public class Main {

	public static void main(String[] args) {
		
		Queue q=new Queue();
		q.push(10);
		q.push(20);
		System.out.println(q.pop());
		System.out.println("--------------");
		q.push(30);
		q.push(40);
		q.push(50);
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.pop());
		System.out.println(q.isEmpty());
	}
}