
public class QS {
	
	public static void quickSort(int ar[],int l,int h) {
		
		if(l < h) {
		int index = partition(ar,l,h);
		quickSort(ar, l, index-1);
		quickSort(ar, index+1, h);
		}
	}
	
	public static int partition(int ar[],int l,int h) {
		
		int pivot=ar[h];
		int i=l-1;
		
		for(int j=l;j<h;j++) {
			
			if(ar[j] < pivot) {
			
			++i;
			int temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;	
				
			}
		}
		
		ar[h]=ar[i+1];
		ar[i+1]=pivot;
		
		return i+1;
	}

	public static void main(String[] args) {
		
		int arr[]=new int[] {2,54,1,43,5,12,6,89,787,45,35,49};
		int low=0;
		int high=arr.length-1;
		quickSort(arr, low, high);
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}