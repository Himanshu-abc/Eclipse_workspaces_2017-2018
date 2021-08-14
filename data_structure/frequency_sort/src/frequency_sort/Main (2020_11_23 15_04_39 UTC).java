package frequency_sort;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		int arr[]=new int[]{1,5,3,7,8,4,6,3,7,7,3,6,6,3,4,6,3,6,3,6,9,8,3,56,8,8,};
		
		// sort the array
		Quick_sort qs=new Quick_sort();
		qs.quick_sort(arr);
		
		int i=0,j=0;
		Map<Integer,Integer> map=new HashMap<>();
		
		for(int k : arr) {
			
			i=k;
			map.put(i, k);
			
		}
	}
}
