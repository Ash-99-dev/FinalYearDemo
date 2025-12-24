package com.demo;

public class internMethodString {

	public static void main(String[] args) {
		String sq = new String("Deep");
		// intern method move to cp
		String s2 = sq.intern();
		String s3 = sq.intern();
		if(s2 == s3) {
			System.out.println("Equal");
		}else {
			System.out.println("not Equal");
		}
		
		
	}

}
