/*
 *  list out the duplicate characters....
 */
package string_Programs;

import java.util.ArrayList;

public class DuplicateCharacter {
	
	public static ArrayList<Character> printDuplicateCharacters(String str) {
		
		ArrayList<Character> ar=new ArrayList<Character>();
		
		for(int i=0;i<str.length()-1;i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					ar.add(str.charAt(i));
					System.out.println(str.charAt(i));
				}
			}
		}
		
		return ar;
		
		
	}

	public static void main(String[] args) {
		
		ArrayList<Character> ar2=new ArrayList<Character>();
		ar2=printDuplicateCharacters("abcaccb");
		
		System.out.println(ar2);
		
	}

}
