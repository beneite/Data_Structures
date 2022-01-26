package string_Programs;

public class subString {

	public static void main(String[] args) {
		
		String str="Attachment number:aAA-12345678";
		int startIndex=-1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A' && str.charAt(i+1)=='A') {
				startIndex=i;
				break;
			}
		}
		
		String newStr=(String) str.subSequence(startIndex, str.length());
		System.out.println(newStr);

	}

}
