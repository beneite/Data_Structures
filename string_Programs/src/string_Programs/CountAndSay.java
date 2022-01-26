package string_Programs;

public class CountAndSay {
	
	 public static String countAndSay(int n) {
	        
	        StringBuilder str=new StringBuilder("111112223");
	        StringBuilder str2=new StringBuilder();
	        int cnt=1;
	        if(n==1)
	        	return "1";
	        else {
	        	for(int i=0;i<str.length()-1;i++) {
	        		System.out.println(i);
	        		for(int j=i+1;j<str.length();j++) {
	        			if(str.charAt(i)==str.charAt(j)) {
	        				cnt++;
	        			}
	        		}
	        		str2.append(cnt);
	        		str2.append(str.charAt(i));
	        		cnt=1;
	        		str2.replace(0, str.length()-1,str.toString());
	        	}
	        }
	        
	        return str2.toString();
	        
	    }

	public static void main(String[] args) {
		
		System.out.println(countAndSay(2));

	}

}
