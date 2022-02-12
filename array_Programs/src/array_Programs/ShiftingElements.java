package array_Programs;

import java.util.Arrays;

public class ShiftingElements {
	
	public static int[] shiftingElements(int[] arr, int n) {
		
		while(n>0) {
			int arrayLastElement=arr[arr.length-1];
		
			for(int i=arr.length-2;i>=0;i--) {
				arr[i+1]=arr[i];
			}
			arr[0]=arrayLastElement;
			n--;
			
		}
		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5};
		int movePosition=3;
		System.out.println("Original Array:"+Arrays.toString(arr));
		System.out.println("Array After Shifting "+movePosition+" position :"+Arrays.toString(shiftingElements(arr,movePosition)));
	}

}
