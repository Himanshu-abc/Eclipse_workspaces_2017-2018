package com.pp;

public class MinHeap {
	
	private int [] theHeap;
	private int position;
	private int capacity;
	
	public MinHeap() {
		position=1;  //  1 indexing
		capacity=10;
		theHeap=new int[capacity];
	}
	
	public void add(int item) {
		
		if(position==capacity) {
			// increase the value
			resize();
		}
		
		theHeap[position++]=item;
		
		int child=position-1;
		int parent=child/2;
		
		while(theHeap[parent]>theHeap[child] && parent>0) {
			
			int temp=theHeap[parent];
			theHeap[parent]=theHeap[child];
			theHeap[child]=temp;
			
			child=parent;
			parent=child/2;
		}
	}
	
	private void resize() {
		
		int tempa[]=theHeap;
		
		capacity=capacity*2;
		theHeap=new int[capacity];
		
		for(int i=0;i<tempa.length;i++) {
			theHeap[i]=tempa[i];
		}
	}
	
	public void print() {
		for(int i=1;i<position;i++) {
			System.out.print(theHeap[i]+" ");
		}
	}

}
