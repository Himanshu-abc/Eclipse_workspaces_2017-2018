package main;

public class Stack {

	private int top;
	private int [] object;
	private int stackSize;
	
	Stack(){
		top=-1;
		stackSize=1;
		object=new int[stackSize];
	}
	
	public void push(int item) {
		if(top>=stackSize-1) {
		 resize();
		}
		object[++top]=item;
	}
	
	public int size() {
		return stackSize;
	}
	
	public int top() {
		return object[top];
	}
	
	private void resize() {
		
		int temp[]=object;
		stackSize=stackSize*2;
		object=new int[stackSize];
		
		for(int i=0;i<=top;i++) {
			object[i]=temp[i];
		}
	}
	public Integer pop() {
		if(top<0) {
		   return null;
		}
		return object[top--];
	}
}	