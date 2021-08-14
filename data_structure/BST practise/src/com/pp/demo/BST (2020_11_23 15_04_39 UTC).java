package com.pp.demo;

public class BST {
	
	private Node root;
	private int size;
	
	public BST() {
		root=null;
		size=0;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	public void insert(int data) {
		root = insert(root, data);
	}
	
	private Node insert(Node root,int data) {
		
		if(root==null) {
		return root = new Node(data);
		}
		if(root.data>data)
		root.leftChild = insert(root.leftChild, data);
		else
		root.rightChild = insert(root.rightChild, data);
		
		return root;
	}
	
	public void search(int data) {
		 System.out.println(search(root,data));
	}
	
	private boolean search(Node root,int value) {
		
		boolean found = false;
		
		while(!found && root!=null) {
			
			if(root.data>value) {
				root=root.leftChild;
			}
			else if(root.data<value)
				root=root.rightChild;
			else {
				found=true;
				break;
			}
			search(root, value);
		}
		return found;
	}
}