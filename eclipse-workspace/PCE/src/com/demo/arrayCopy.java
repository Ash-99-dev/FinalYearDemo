package com.demo;

public class arrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,20,3,4};
		int b[] = new int[a.length];
		
		int j = a.length-1;
		for(int i = 0; i < a.length; i++) {
			b[i] = a[j];
			j--;
		}
		for(int al : b) {
			System.out.println(al+" ");
		}
		
	}

}
