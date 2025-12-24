package com.demo;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		String s = "My name is ashmit";
		StringTokenizer st = new StringTokenizer(s, " ");
		int count = 0;
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
			count++;
		}
		System.out.println(count);
		 
		char[] c = s.toCharArray();
		for(int i = c.length-1; i >= 0; i--) {
			System.out.println(c[i]);
		}
		
		
	}

}
