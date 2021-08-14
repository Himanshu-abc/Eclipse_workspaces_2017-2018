package p1;

public class Stackx {
	
	private int top;
	private int stackSize;
	private int [] arr;
	
	public Stackx() {
	  top=-1;
	  stackSize=1;
	  arr=new int[stackSize];
	}

	public void push(int data) {
		if((top+1)>=stackSize) {
			reSize();
		}
		arr[++top]=data;
	}
	
	private void reSize() {
		
		int [] temparr=arr;
		stackSize=stackSize*2;
		arr=new int[stackSize];
		int i=0;
		for(int ax:temparr) {
			arr[i]=ax;
			++i;
		}
	}
	public int stackSize() {
		return stackSize;
	}
	
	public int top() {
		return arr[top];
	}
	
	public Integer pop() {
		if(top!=-1) {
			return arr[top--];
		}
		return null;
	}
}
