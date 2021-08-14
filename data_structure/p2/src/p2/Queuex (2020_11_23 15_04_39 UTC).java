package p2;

public class Queuex {
	
	private int front;
	private int rear;
	private int queueSize;
	private int [] qarr;
	
	public Queuex() {
		front = rear = -1; 
		queueSize = 3;
		qarr=new int[queueSize];
	}
	
	public void enQueue(int data) {
		
		if(front+1 >= queueSize) {
			reSize();
		}
		qarr[++front]=data;
	}
	
	private void reSize() {
		
		int [] temp = qarr;
		queueSize = queueSize*2;
		qarr = new int[queueSize];
		
		for(int i=0;i<=front;i++) {
			qarr[i]=temp[i];
		}
	}
	
	public Integer deQueue() {
		
		if(front==-1 || rear >= front) {
			return null;
		}
		return qarr[++rear];
	}
	
	public Integer rear() {
		if((rear==-1 && front==-1) || rear>=front) {
			return null;
		}
		return qarr[rear+1];
	}
	
	public Integer front() {
		if(front==-1 || rear>= front ) {
			return null;
		}
		return qarr[front];
	}
}
