package com.demo;

class Student{
	String name;
	int age;
	String gender;
	
	void eat() {
		System.out.println("Student is eating "+age);
	}
}
public class firstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Student().age=12;
		new Student().eat();
	}

}
