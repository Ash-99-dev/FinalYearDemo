package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MoreOnStringTokenizer {

	public static void main(String[] args) {
		String s = "I am ashmit";
		StringTokenizer st = new StringTokenizer(s, " ");
		
		List<String> ls = new ArrayList<>();
		while(st.hasMoreTokens()) {
			ls.add(st.nextToken());
			
		}
		for(int i = ls.size()-1; i >= 0; i--) {
			System.out.print(ls.get(i)+" ");
			System.out.println(ls.get(i).length());
		}
		
 		/*while(st.hasMoreTokens()) {
			
			      //String tokenizer in reverse
			char[] c = st.nextToken().toCharArray();
		
			for(int i = c.length-1; i >= 0; i--) {
				System.out.print(c[i]);
			}
			System.out.print(" ");
			
		}
		/*char[] c = st.toCharArray();
		for(int i = c.length-1; i >= 0; i++) {
			System.out.println(c[i]);
		}*/
	}
}
// to do
// string - i am iron man
// display - man iron am i
