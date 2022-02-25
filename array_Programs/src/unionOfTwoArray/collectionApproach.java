/*
 *  Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays.
 */
package unionOfTwoArray;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class collectionApproach {
	
	public static HashSet<Integer> arrayToSet(Integer[] a,Integer[] b)
	{
		HashSet<Integer> set = new HashSet<>(); 
	       
	      set.addAll(Arrays.asList(a));
	       
	      set.addAll(Arrays.asList(b));
	      
		return set;
	}

	public static void main(String[] args) {

		Integer[] a= {1,2,3,6};
		Integer[] b= {1,2,3,4,5};
		Integer[] union = {};
		HashSet<Integer> hs=arrayToSet(a,b);
		 union = hs.toArray(union);
		System.out.println(Arrays.toString(union));
	}

}
