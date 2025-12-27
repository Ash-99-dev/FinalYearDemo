package com.Encapsulation;

public class practiseDemo {

	public static void main(String[] args) {
		int[] arr = {11, 92, 2 ,74 ,55, 0 ,10 ,-60 ,24, 91, -67, 11};
		float res = 0;
		int sum = 0, num = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				sum += arr[i];
				num++;
			}
		}
		res = sum/num;
		System.out.println(res);
	}

}
