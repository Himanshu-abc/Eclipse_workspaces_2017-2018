package practise4;

public class Pthree {

	public static void main(String[] args) {

		// find smallest element in array
		
		int arr[]=new int[]{18,14,10,1,8,3,234,66};
		
		int l=arr.length;
		int min=0;
		
		for (int i = 0; i < l; i++) {
		
			for(int j =  i + 1 ; j < l ; j++) {
				
				if(arr[i] > arr[j]) {
					
					min=arr[j];
					arr[j]=arr[i];
					arr[i]=min;
				
				}
			}
		}
		for(int i=0;i<l;i++) {
			System.out.println(arr[i]);
		}
	}
}
