/*
 *   program to print the Kth Smallest element.... (Quick select)
 */
package array_Programs;

public class KthSmallestElement {

	public static int findElement(int[] arr, int k) {
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
				--k;
			}
			if(k==0)
				return min;
		}
		return 0;
	}
	public static void main(String[] args) {
		
		int[] arr= {6,2,3,4,5};
		int k=3;
		System.out.println(findElement(arr,k));

	}
	/*
	 *
https://afteracademy.com/blog/kth-smallest-element-in-an-array
Brute Force approach : Using sorting
Using Min-Heap
Using Max-Heap
Quick select : Approach similar to quick sort
	 */

}
