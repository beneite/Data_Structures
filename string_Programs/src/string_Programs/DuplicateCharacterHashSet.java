package string_Programs;

import java.util.HashSet;

public class DuplicateCharacterHashSet {
	
	public static void duplicateCharacter(String str) {
		
		HashSet hs=new HashSet();
		
		for(int i=0;i<str.length();i++) {
			hs.add(str.charAt(i));
		}
		
		for(Object ob:hs) {
			System.out.println(ob);
		}
		
	}

	public static void main(String[] args) {
		
		String str="ABCRTDEFAB";
		duplicateCharacter(str);

	}

}
