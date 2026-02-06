package com.questions;

public class Min_MaxArray {

	public static void main(String[] args) {
		int arr[] = {10, 20, 99, 30, 5, 40, 60, 45};
		int min = arr[0], max = arr[0];
		System.out.println("----Minimum | Maximum Array----");
		for(int i = 1; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}else if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("min "+min+",  max "+max);
	
	}
}
