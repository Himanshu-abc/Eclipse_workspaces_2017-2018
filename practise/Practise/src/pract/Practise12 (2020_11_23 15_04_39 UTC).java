package pract;

public class Practise12 {

	public static void main(String[] args) {
	
		int arr[]= {12,11,5,89,3,23,56,76};
		
		int temp=0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("smallest element is "+arr[0]);
		System.out.println("second smallest element is "+arr[1]);
		System.out.println("largest element is "+arr[arr.length-1]);
		System.out.println("second largest element is "+arr[arr.length-2]);
	}
}