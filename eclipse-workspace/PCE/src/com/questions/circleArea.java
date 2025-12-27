package com.questions;

import java.util.Scanner;

class Area{
	float pi;
	int r;
	Area(float pi, int r){
		this.pi = pi;
		this.r = r;
	}
	
	public float display() {
		return pi*r*r;
	}
}
public class circleArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PI: ");
		float pi = sc.nextFloat();
		System.out.println("Enter radius: ");
		int r = sc.nextInt();
		Area a = new Area(pi,r);
		System.out.println(a.display());
		sc.close();
	}

}
