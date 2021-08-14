package main;

public class CircularArray {
	
	private int size;
	private int front;
	private int rear;
	private int[] array;
	
	public CircularArray() {
		front=0;
		rear=0;
		size=5;
		array=new int[size];
	}
	
	public int noOfElements() {
		return (size-front+rear)%size;
	}
	
	public boolean isEmpty() {
		return rear==front;
	}
	
	public void enqueue(int item) {
		int s=noOfElements();
		
		if(s==size-1) {
			resize();
		}
		array[rear++]=item;
		if(rear==size) {
			rear=0;
		}
	}
	
	public Integer dequeue() {
		if(isEmpty()) {
			return null;
		}
		
		int x=array[front++];
		if(front==size) {
			front=0;
		}
		return x;
	}
	
	private void resize() {
		
		int s=noOfElements();
		
		int lastIndex=s+1;
		
		size=2*size;
		
		int arr[]=new int[size];
		
		int i=0;
		
		while(s>0) {
			s--;
			arr[i++]=array[front++];
			
			if(front==lastIndex) {
				front=0;
			}
			
			rear=i++;
			front=0;
			arr=array;
		}
	}
}