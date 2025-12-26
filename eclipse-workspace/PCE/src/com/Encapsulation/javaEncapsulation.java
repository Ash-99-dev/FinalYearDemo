package com.Encapsulation;

import java.util.Scanner;
class Student{
	private String name;
	private int rollNumber;
	private String gender;
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setrollNumber(int r) {
		rollNumber = r;
	}
	public int getrollNumber() {
		return rollNumber;
	}
	public void setgender(String g) {
		gender = g;
	}
	public String getgender() {
		return gender;
	}
}
public class javaEncapsulation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		System.out.println("Enter name: ");
		String name = sc.next();
		s.setName(name);
		System.out.println("Enter roll Number: ");
		int rollNumber = sc.nextInt();
		s.setrollNumber(rollNumber);
		System.out.println("Enter gender: ");
		String g = sc.next();
		s.setgender(g);
		System.out.println("Student Name: "+s.getName()+", rollNumber: "+s.getrollNumber()+", gender: "+s.getgender());
		sc.close();
	}

}
