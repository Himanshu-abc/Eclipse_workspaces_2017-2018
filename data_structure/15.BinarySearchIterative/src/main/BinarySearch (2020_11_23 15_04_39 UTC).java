package main;

public class BinarySearch {

	public static boolean BSearch(int arr[],int key) {
		int low=0;
		int high=arr.length-1;
		
		while(low<=high) 
		{	
			int mid = (low+high)/2;
			if(arr[mid]==key) {
				return true;
			}
			
			else if (arr[mid] > key) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		int array[]=new int[] {1,2,3,8,12,20,35,36,40,41,55,99};
		System.out.println(BSearch(array, 8));
	}
}
