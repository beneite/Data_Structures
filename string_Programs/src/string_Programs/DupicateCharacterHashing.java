/*
 *   Program to print the duplicate character using hashing...   https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/
 */
package string_Programs;

import java.util.HashMap;
import java.util.Map;

public class DupicateCharacterHashing {
	
	public static void printDuplicates(String str) {
		
		HashMap<Character, Integer> map=new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			}else {
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
		}
		
		for(Map.Entry<Character, Integer> mapElement: map.entrySet()) {
			char key=(char)mapElement.getKey();
			int value=(int)mapElement.getValue();
			
			if(value>1)
				System.out.println(key);
		}
	}

	public static void main(String[] args) {
		
		printDuplicates("nitint");

	}

}
