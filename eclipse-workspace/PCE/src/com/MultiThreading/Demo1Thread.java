package com.MultiThreading;

public class Demo1Thread {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		//O/P : [No. of thread, Stack, Priority, class]
	}
}
