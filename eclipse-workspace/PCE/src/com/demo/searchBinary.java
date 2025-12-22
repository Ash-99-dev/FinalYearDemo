package com.demo;

public class searchBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,20,30,40,50,60};
		int low = 0, high = arr.length-1;
		int mid = (low+high)/2;
		int key = 60, index = 0;
		boolean found = false;
		while(low <= high) {
			if(arr[mid] == key) {
				index = mid;
				found = true;
				break;
			}else if(arr[mid] < key) {
				low = mid+1;
				mid = (low+high)/2;
			}else {
				high = mid-1;
				mid = (low+high)/2;
			}
		}
		if(found) {
			System.out.println("Index is: "+index);
		}else {
			System.out.println("Index not found ");
		}
	}

}
//swap 2 array indexes given by user
