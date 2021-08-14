package main;

public class BinarySearch {

	public static int BSearch(int arr[],int left,int right,int key) {
		
		if(left<=right) {
			int mid=(left+right)/2;
			
		if(arr[mid]==key) {
			return mid;
		}
		else if (arr[mid] > key) {
			return BSearch(arr, left, mid-1, key);
		} 
		else {
			return BSearch(arr, mid+1, right, key);
		}
	}
		return -1;
	}
	public static void main(String[] args) {
	
		int array[]=new int[] {2,7,12,23,34,45,65,76,78,80,84,86,89,93};
		System.out.println(BSearch(array, 0, array.length-1, 34));
	}
}
