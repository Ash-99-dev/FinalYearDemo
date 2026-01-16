package com.coreProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class practise_try {

	public static void main(String[] args) {
		Map<Integer, Integer> practise= new HashMap<>(); 
		practise.put(1, 20);
		practise.put(2, 22);
		practise.put(3, 33);
		System.out.println(practise);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value: ");
		int a = sc.nextInt();
		int id = practise.get(a);
		System.out.println();
		sc.close();
	}
}
