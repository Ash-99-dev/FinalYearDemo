package com.demo;

public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {30,20,10,50,40};
		System.out.println("before swapping\n");
		for(int e : arr) {
			System.out.print(" "+e);
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println("\nafter swapping\n");
		for(int e : arr) {
			System.out.print(" "+e);
		}
	}

}
