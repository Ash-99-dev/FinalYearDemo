package com.MultiThreading;

//MultiThreading by implementing Runnable class
class typing1 implements Runnable{
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

class spellCheck1 implements Runnable{
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

class saving1 implements Runnable{
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

public class ThreadingImplementing {

	public static void main(String[] args) {
		
		typing1 type = new typing1();
		spellCheck1 spellcheck = new spellCheck1();
		//saving1 save = new saving1();
		Thread t11 = new Thread(type);
		Thread t12 = new Thread(spellcheck);
		Thread t13 = new Thread(new saving1());
		t11.start();
		t12.start();
		t13.start();
	}

}
