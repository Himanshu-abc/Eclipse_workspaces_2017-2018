package com.pp;

public class Merge_Sort {
	
	public static void merge(int[] ar,int l,int m,int h) {
		
		int n1=m-l+1;
		int n2=h-m;
		
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		for(int i=0;i<n1;i++) 
			L[i]=ar[l+i];
		for(int i=0;i<n2;i++)
			R[i]=ar[m+1+i];
		
		int i=0,j=0,k=l;
		
		while(i<n1 && j<n2) {
			
		if(L[i]<=R[j]) {
			ar[k++]=L[i];
			i++;
		}
		else {
		    ar[k++]=R[j];
		    j++;
		}
		}
		
		while(i<n1) {
			ar[k++]=L[i];
			i++;
		}
		while(j<n2) {
			ar[k++]=R[j];
			j++;
		}
			
	}
	
	public static void mergeSort(int [] ar,int l,int h) {
		
		if(l<h) {
			int mid=(l+h)/2;
			mergeSort(ar, l, mid);
			mergeSort(ar, mid+1, h);
			merge(ar, l, mid, h);
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]=new int[] {12,5,34,76,23,15,35,96,22,03};
		int low=0;
		int high=arr.length-1;
		mergeSort(arr, low, high);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
