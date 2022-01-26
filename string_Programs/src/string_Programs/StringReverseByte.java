/*
 *  program to reverse a String using Byte...
 */
package string_Programs;

public class StringReverseByte {

public static String reverseString(String str) {
		
		byte[] strAsByteArray = str.getBytes();
		 
	    byte[] result = new byte[strAsByteArray.length];
	
	    // Store result in reverse order into the
	    // result byte[]
	    for (int i = 0; i < strAsByteArray.length; i++)
	        result[i] = strAsByteArray[strAsByteArray.length - i - 1];

	    return new String(result);
	}

	
	public static void main(String[] args) {
		
		String s1=new String("ABC1234567");		
		String s2=reverseString(s1);
		System.out.println(s2);
	}

}
