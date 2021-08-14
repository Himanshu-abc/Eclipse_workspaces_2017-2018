package main;

public class Queue {

	private int front;
	private int rear;
	private int[] object;
	private int queueSize;
	
	public Queue() {
		
		front = -1;
		rear = -1;
		queueSize = 3;
		object=new int[queueSize];
	}
	
	public void push(int item) {
		
		if(front >= queueSize-1) {
			resize();
		}
		object[++front]=item;
	}
	private void resize() {
		
	int[] temp=object;
	queueSize=queueSize*2;
	object=new int[queueSize];
    
	for(int i=0;i<=front;i++) {
		object[i]=temp[i];
	}
	}
	
	public Integer pop() {
		if(front > rear) {
			return object[++rear];
		}
		return null;
	}
	
	public boolean isEmpty() {
		return rear>=front;
	}
}