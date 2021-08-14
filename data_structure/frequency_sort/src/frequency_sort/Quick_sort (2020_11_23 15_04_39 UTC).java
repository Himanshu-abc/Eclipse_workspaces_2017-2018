package frequency_sort;

public class Quick_sort {
	
	public void quick_sort(int arr[]) {
		
	int low=0;
	int high=arr.length-1;
	
	quicksort(arr, low, high);
	}
	
	private void quicksort(int [] ar,int low,int high) {
		
		if(low<=high)
		{
		int index = partition(low, high, ar);
		quicksort(ar, low, index-1);
		quicksort(ar, index+1, high);
		}
	}
	
	private int partition(int low,int high,int ar[]) {
		
		int pivot=ar[high];
		
		int i=low-1;
		
		for(int k=low;k<high;k++) {
			
			if(ar[k]<pivot) {
				
				i++;
				int temp=ar[k];
				ar[k]=ar[i];
				ar[i]=temp;
			}
		}
		
		i=i+1;
		
		ar[high]=ar[i];
		ar[i]=pivot;
		
		return i;
	}
	
	
}
