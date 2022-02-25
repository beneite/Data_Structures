/*
 *  Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.
 */
package unionOfTwoArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class simpleApproach {
	
	public static Set<Integer> mergeArray(int[] a,int[] b)
	{
		int z=0;
		Set<Integer> hs=new HashSet<Integer>();
		int[] arr=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		
		for(int i=0;i<b.length;i++)
		{
			hs.add(b[i]);
		}
		return hs;
	}

	public static void main(String[] args) {

		int[] a= {1,2,3,6};
		int[] b= {1,2,3,4,5};
		Set<Integer> hs=mergeArray(a,b);
		
		System.out.println(hs);
	}

}
