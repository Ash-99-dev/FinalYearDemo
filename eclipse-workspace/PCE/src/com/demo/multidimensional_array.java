package com.demo;
import java.util.Scanner;
/*
public class multidimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int college, classes, student;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of colleges: ");
		
		college = sc.nextInt();
		System.out.println("Enter number of classes: ");
		classes = sc.nextInt();
		System.out.println("Enter number of student: ");
		student = sc.nextInt();
		int a[][][] = new int[college][classes][student];
		
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {
				for(int k = 0; k < a[i][j].length; k++) {
					System.out.println("Enter College: "+i+", Class: "+j+", Student: "+k+" :");
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("the values are: \n");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				for(int k = 0; k < a[i][j].length; k++) {
					System.out.println("College: "+i+", Class: "+j+", Student: "+k+", are: "+a[i][j][k]);
				}
				System.out.println();
			}
		}
	}
}
*/

public class multidimensional_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int college, classes, student;
		System.out.println("for jagged array: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of colleges: ");
		college = sc.nextInt();
		
		System.out.println("Enter number of student: ");
		student = sc.nextInt();
		int a[][][] = new int[college][][];
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("Enter number of classes: ");


			for(int j = 0; j < a[i].length; j++) {
				for(int k = 0; k < a[i][j].length; k++) {
					System.out.println("Enter College: "+i+", Class: "+j+", Student: "+k+" :");
					a[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("the values are: \n");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				for(int k = 0; k < a[i][j].length; k++) {
					System.out.println("College: "+i+", Class: "+j+", Student: "+k+", are: "+a[i][j][k]);
				}
				System.out.println();
			}
		}
	}
}
