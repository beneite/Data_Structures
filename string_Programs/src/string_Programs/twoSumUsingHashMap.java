package string_Programs;

import java.util.Arrays;
import java.util.HashMap;

public class twoSumUsingHashMap {
	
	public static int[] twoSumMethod(int[] arr, int target) {
		
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		int[] a=new int[2];
		
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(target-arr[i])) {
				a[0]=i;
				a[1]=map.get(target-arr[i]);
				return a;
			}
			
			map.put( arr[i],i);
		}
		
		return null;
	}

	public static void main(String[] args) {
	
		 int [] arr= {1,2,3,4};
		 int target=3;
		 
		 System.out.println(Arrays.toString(twoSumMethod(arr,target)));

	}

}
