package main;

public class BubbleSort {

	public static void BSort(int a[]) {
		
		int size=a.length;
		
		for(int i=0;i<size;i++) {
			
			for(int j=0;j<size-1;j++) {
				
				if(a[j]>a[j+1])
				{	
					int temp=a[j];
				    a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[]=new int[] {5,1,4,2,8,7,22};
	    BSort(arr);
	    //print
	    for(int i=0;i<arr.length;i++) {
	    	System.out.println(arr[i]);
	    }
	}
}
