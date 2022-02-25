/*
 *  Java program to put all negative numbers before positive numbers.
 */
package shiftNegativeToStart;

import java.util.Arrays;


class ShiftingElements {

	
	int[] shiftArrayElements(int[] a)
	{
		int j=0,temp;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				if(i!=j)
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				j++;
			}
		}
		return a;
	}
	public static void main(String[] args) {

		int[] arr= {1,2,3,-2,-3,-1,4,-5};
		ShiftingElements cn=new ShiftingElements();
		arr=cn.shiftArrayElements(arr);
		System.out.println(Arrays.toString(arr));
	}

}
