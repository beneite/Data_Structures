/*
 *  program to reverse a String...
 */
package string_Programs;

public class StringReverse {
	
	public static String reverseString(String str) {
		
		StringBuilder sb1=new StringBuilder(str);
		
		String sr=sb1.reverse().toString();
		
		return sr;
	}

	
	public static void main(String[] args) {
		
		String s1=new String("ABC123");		
		String s2=reverseString(s1);
		System.out.println(s2);

	}

}
