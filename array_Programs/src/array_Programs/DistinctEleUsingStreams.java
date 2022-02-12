package array_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctEleUsingStreams {
	
	public static int[] printDistinctElement(Integer[] arr) {
		
		List<Integer> al= Arrays.asList(arr);
		List<Integer> ls=new ArrayList<>();
		
		ls=al.stream().distinct().collect(Collectors.toList());
		
		int[] newArr=new int[ls.size()];
		int i=0;
		for(Integer el:ls)
		{
			newArr[i]=ls.get(i);
			i++;
		}
		return newArr;
		
	}

	public static void main(String[] args) {
		Integer[] arr= {10,20,30,10,30,40,60};
		int[] arr2=printDistinctElement(arr);
		System.out.println(Arrays.toString(arr2));
	}

}
