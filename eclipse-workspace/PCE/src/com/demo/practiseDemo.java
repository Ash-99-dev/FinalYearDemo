package com.demo;

class multiThread implements Runnable{
	private String name;
	multiThread(String name){
		this.name = name;
	}
	public void run() {
		System.out.println(name+" running at "+Thread.currentThread().getName());
	}
}
public class practiseDemo {

	public static void main(String[] args) {
		Thread mt1 = new Thread(new multiThread("Pasta"));
		Thread mt2 = new Thread(new multiThread("sandwitch"));
		Thread mt3 = new Thread(new multiThread("fries"));
		Thread mt4 = new Thread(new multiThread("burger"));
		
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
	}

}
