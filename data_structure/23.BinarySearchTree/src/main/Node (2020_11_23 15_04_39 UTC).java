package main;

public class Node {

	public Node leftchild;
	public Node rightchild;
	private int data;
	
	public Node() {
		
		leftchild=null;
		rightchild=null;
		data=0;
	}
	
	public Node (int data) {
		leftchild = rightchild = null;
		this.data=data;
	}
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
}