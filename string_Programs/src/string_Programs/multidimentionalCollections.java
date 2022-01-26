/*
 *   making a multi-dimensional String store in a multi dimensional ArrayList....
 */
package string_Programs;

import java.util.ArrayList;

public class multidimentionalCollections {

	public static void main(String[] args) {
		
		String[][] str={{"a","b","1","2"},{"c","d","e"},{"hi","lol"}};
		
		ArrayList <ArrayList<String>> arr= new ArrayList <ArrayList<String>>();
		ArrayList<String> ls=new ArrayList<String>();
		
		for(int i=0;i<str.length;i++) {
			for(int j=0;j<str[i].length;j++) {
				ls.add(str[i][j]);
			}
			arr.add(new ArrayList<String>(ls));
			ls.clear();
		}
		
		System.out.println(arr);
		
	}

}
