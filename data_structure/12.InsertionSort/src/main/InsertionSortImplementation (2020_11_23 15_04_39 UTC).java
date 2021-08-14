package main;

public class InsertionSortImplementation {

	private static void insertionSort(int array[],int length) {
		int i,j,key;
		
		for(i=1;i<length;i++) {
			 key=array[i];
			 j=i-1;
			
			while(j>=0 && array[j]>key) {
			
			array[j+1]=array[j];
			j=j-1;
			}
			array[j+1]=key;
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]=new int []{12,11,13,5,6};
		int length=arr.length;
		
		insertionSort(arr, length);
		
		for(int c=0;c<length;c++) {
			System.out.println(arr[c]);
		}
	}
}