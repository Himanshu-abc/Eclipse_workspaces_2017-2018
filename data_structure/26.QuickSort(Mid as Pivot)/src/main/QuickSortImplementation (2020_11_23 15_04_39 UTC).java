package main;

public class QuickSortImplementation {

	private static void quickSort(int [] arr,int left, int right) {
		
		int index = partition(arr,left,right);
		
		if(left<index-1) {
			quickSort(arr, left, index-1);
		}
		if(index<right) {
			quickSort(arr, index, right);
		}
	}
	
	private static int partition(int [] array ,int left,int right) {
		
		int pivot=array[(left+right)/2];
		while(left<=right) {
			while(array[left]<pivot) left++;
			while(array[right]>pivot)right--;
			
			if(left<=right) {
				int tmp=array[left];
				array[left]=array[right];
				array[right]=tmp;
				
				left++;
				right--;
			}
		}
		return left;
	}
	
	public static void main(String[] args) {
	
		int array[]=new int[] {10,9,8,7,6,5,4,3,2,1};
		quickSort(array, 0, array.length-1);
		//print
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
}