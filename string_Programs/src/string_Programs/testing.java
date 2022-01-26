package string_Programs;

import java.util.Arrays;

public class testing {

	public static void main(String[] args) {
		final int kMax = 6;
		int[] nums= {1,2,3,4,5};
	    int ans = 0;
	    int[] count = new int[kMax + 1];

	    for (final int num : nums)
	      ++count[num];
	    
	    System.out.println(Arrays.toString(count));
	}

}
