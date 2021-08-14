package p3;

public class Cqueue {
	
	private int front;
	private int rear;
	private int size;
	private int [] arr;
	
	public Cqueue() {
		front = 0;
		rear = 0;
		size = 3;
		arr = new int[size];
	}
	
	private int noOfElements() {
		return (size-front+rear)%size;
	}
	
	public void enQueue(int data) {
		
		if(noOfElements()+1 >= size) {
			reSize();
		}
		arr[rear++]=data;
		if(noOfElements()+1 < size && rear >= size) {
			rear=0;
		}
	}
	
	private void reSize() {
		
		int [] temp=arr;
		
		int n=noOfElements();
		int lastIndex=n+1;
		
		size=size*2;
		arr=new int[size];
		int i=0;
		
		while(n > 0) {
			--n;
			arr[i++]=temp[front];
			if(front==lastIndex) {
				front=0;
			}
		}
		front=0;
		rear=i;
	}
	
	public Integer deQueue() {
		
		if(rear == front || noOfElements()==0) {
			return null;
		}
		int x=arr[front++];
		if(front >= size) {
			front=0;
		}
		return x;
	}

}
