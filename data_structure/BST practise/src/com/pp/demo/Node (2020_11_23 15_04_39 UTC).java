package com.pp.demo;

public class Node {
	
	public int data;
	public Node leftChild;
	public Node rightChild;
	
	public Node(int data) {
		leftChild=rightChild=null;
		this.data=data;
	}
	
	public Node(Node leftChild,int data,Node rightChild) {
		
		this.data=data;
		this.leftChild=leftChild;
		this.rightChild=rightChild;
	}
}
