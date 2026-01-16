package com.MultiThreading;

// MultiThreading by extending Thread class
class typing extends Thread{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Typing....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class spellCheck extends Thread{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Spell Checking....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class saving extends Thread{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Saving....");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Demo3Threading {

	public static void main(String[] args) {
		typing t1 = new typing();
		spellCheck t2 = new spellCheck();
		saving t3 = new saving();
		t1.start();
		t2.start();
		t3.start();
	}

}
