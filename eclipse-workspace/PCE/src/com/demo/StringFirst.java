package com.demo;

public class StringFirst {

	public static void main(String[] args) {
		String s1 = "Ashmit";
		String s2 = "Ashmit";
		
		if(s1 == s2) {
			System.out.println("References are equal");
		}else {
			System.out.println("References are equal");
		}

		if(s1.equals(s2)) {
			System.out.println("values are equal");
		}else {
			System.out.println("values are equal");
		}
	}

}
