package main;

public class Main {

	public static void main(String[] args) {
		Stack stack=new Stack();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("stack top is "+stack.top());
		System.out.println("stack size is "+stack.size());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
