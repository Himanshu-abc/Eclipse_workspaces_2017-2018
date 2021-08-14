package main;

public class SelectionSortImplementation {

	public static void selectionSort(int arr[],int size) {
		
		int i,min_index;
		for(i=0;i<size-1;i++) {
			
			min_index = findSmallestIndex(arr,i,size);     // find the smallest element of unsorted array
			
			int temp = arr[min_index];    //swap the smallest found element with position i
			arr[min_index] = arr[i];
			arr[i] = temp;
		}  }
	
	public static int findSmallestIndex(int array[], int i, int n) {
		int smallestAt = i;
		
		for(int j=i+1;j<n;j++) {
			if(array[j] < array[smallestAt]) 
				smallestAt = j;  }
		return smallestAt;  }
	
	public static void main(String[] args) {
	
		int [] array = new int[] {64,25,12,11,15};
		int size=array.length;
		selectionSort(array, size);
		for(int i=0;i<size;i++) {
			System.out.println(array[i]);
		}}}