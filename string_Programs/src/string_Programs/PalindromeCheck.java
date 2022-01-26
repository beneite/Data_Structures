/*
 *  string is palindrome or not....
 */
package string_Programs;

public class PalindromeCheck {
	
	public static String palindromeCheck(String str) {
		
		int i,len=str.length();
		
		for(i=0;i<len;i++) {
			if(str.toLowerCase().charAt(i)!=str.toLowerCase().charAt(len-1-i)) {
				return "Not a Palindrome";
			}
		}
		return "Palindrome";
	}

	public static void main(String[] args) {
		
		String s1="0P0p";
		System.out.println(palindromeCheck(s1));

	}

}
