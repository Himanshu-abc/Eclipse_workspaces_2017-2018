package main;

public class CountingSortImplementation {

	private static int range;
	public static int [] countingSort(int [] array) {
		
		int values[]=new int[range+1];
		for(int i=0;i<=range;i++) {
		values[i]=0;
		}
		for(int i=0;i<array.length;i++) {
			values[array[i]]++;
		}
		
		int arr[]=new int[array.length];
		int k=0;
		for(int i=0;i<=range;i++) {
			for(int j=0;j<values[i];j++) {
				arr[k++]=i;}}
		return arr;  }
	
	 public static void main(String[] args) {
	
		range=9;
		int array[]=new int[] {1,5,0,6,9,5,0,2,3,4,5,8,7,6,1,4};
		array = countingSort(array);
		//print
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}  }  }