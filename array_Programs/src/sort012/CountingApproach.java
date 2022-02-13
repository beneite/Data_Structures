/*
 *  Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.
 */
package sort012;

import java.util.Arrays;

class CountingApproach {
	
	int[] sortArray(int[] a) 
	{
		int c0=0,c1=0,c2=0,commCnt=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
				c0++;
			else
				if(a[i]==1)
					c1++;
				else
					c2++;
		}
		
		int[] newArray=new int[a.length];
		
		for(int i=0;i<c0;i++,++commCnt)
			newArray[i]=0;																				// putting 0s...
		for(int i=commCnt;i<c0+c1;i++,++commCnt)
			newArray[i]=1;																				// putting 1s...
		for(int i=commCnt;i<c0+c1+c2;i++,++commCnt)
			newArray[i]=2;																				// putting 2s...
		
		return newArray;
	}

	public static void main(String[] args) {

		int[] arr= {1,1,1,0,0,2,2};
		CountingApproach cn=new CountingApproach();
		arr=cn.sortArray(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
