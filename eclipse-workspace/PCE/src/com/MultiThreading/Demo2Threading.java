package com.MultiThreading;

public class Demo2Threading {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		t.setName("PCE");
		t.setPriority(7);
		System.out.println(t);
		duty();
	}
	static void duty() {
		Thread t = Thread.currentThread();
		System.out.println(t);
		// Thread Name does not change it remain same for whole application
	}
}
