package com.pp;

public class QS {
	
	public static void quickSort(int arr[],int l,int h) {
		
		int index = partition(arr, l, h);
		
		if(l<index-1)
		quickSort(arr, l, index-1);
		
		if(h>index)
		quickSort(arr, index, h);
	}
	
	public static int partition(int ar[],int l,int h) {
		
		int pivot=ar[(l+h)/2];
		
		while(l<=h) {
		while(ar[l]<pivot) l++;
		while(ar[h]>pivot) h--;
		
		if(l<=h) {
			int temp=ar[l];
			ar[l]=ar[h];
			ar[h]=temp;
			
			l++;
			h--;
		}
		}
		return l;
	}

	public static void main(String[] args) {
		
		int arr[]=new int[] {2,54,1,43,5,12,6,89,787,45,35,49};
		
		int low=0;
		int high=arr.length-1;
		quickSort(arr, low, high);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}

}
