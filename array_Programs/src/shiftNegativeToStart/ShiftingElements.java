/*
 *  Java program to put all negative numbers before positive numbers.
 */
package shiftNegativeToStart;

import java.util.Arrays;


class ShiftingElements {

	
	int[] shiftArrayElements(int[] a)
	{
		for(int i=a.length-1;i<=0;i--)
		{
			int captureElement=a[i];
			int j=i-1;
			if(a[i]<0)
			{
				
			}
		}
		return null;
	}
	public static void main(String[] args) {

		int[] arr= {1,1,1,0,0,2,2};
		ShiftingElements cn=new ShiftingElements();
		arr=cn.shiftArrayElements(arr);
		System.out.println(Arrays.toString(arr));
	}

}
