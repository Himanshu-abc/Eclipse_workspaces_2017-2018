package main;

public class LinearSearch {
	
	public static int Lsearch(int arr[],int key) {
		int len=arr.length;
		
		for(int i=0;i<len;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
	
		int array[]=new int[] {7,5,3,2,10,100,8};
		System.out.println(Lsearch(array, 9));
	}
}