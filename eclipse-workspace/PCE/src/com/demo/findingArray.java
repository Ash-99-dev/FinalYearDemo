package com.demo;

import java.util.Scanner;

public class findingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 30,20 , 40}; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key: ");
		int key = sc.nextInt();
		boolean bl = false;
		for(int i = 0; i < arr.length; i++) {
			/*if(key == arr[i]) {
				System.out.println(i);
				break;
			} else if(key != arr[arr.length-1] && i == arr.length-1) {
				System.out.println("Key not found");
			}*/
			
			if(key == arr[i]) {
				bl = true;
			}
		}
		if(bl) {
			System.out.println("key found at index");
		}
		else {
			System.out.println("index not found");
		}
	}

}
