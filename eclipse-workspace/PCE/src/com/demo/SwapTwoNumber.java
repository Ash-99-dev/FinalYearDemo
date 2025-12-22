package com.demo;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10, num2 = 20;
		System.out.println("Before swap: "+num1+" "+num2);
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swap: "+num1+" "+num2);
	}

}
// swap  2 array index given by user
/*  ex -
 array given = {1,2,3,4,5};
          index-0,1,2,3,4
          
          given input 2,4
     values = {1,2,5,4,3}
 */