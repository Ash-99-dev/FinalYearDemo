package com.demo;

import java.util.Scanner;

public class arrayIndexSwap {

	public static void main(String[] args) {
		// TODO-swap index of array by taking user input
		int[] arr = {10,20,30,40,50};
		System.out.println("before swapping\n");
		
		for(int e : arr) {
			System.out.print(" "+e);
		}
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter index 1: ");
		int idx1 = sc.nextInt();
		System.out.println("Enter index 2: ");
		int idx2 = sc.nextInt();
		
			int temp = arr[idx1];
			arr[idx1] = arr[idx2];
			arr[idx2] = temp;
			
		System.out.println("after swapping\n");
		for(int e : arr) {
			System.out.print(" "+e);
		}
		

	}

}
