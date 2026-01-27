package com.MultiThreading;

public class multithreadProblemSolution1 {

	public static void main(String[] args) throws InterruptedException {
		Washroom w = new Washroom();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);
		t1.setName("Thor");
		t2.setName("Loki");
		t3.setName("Hulk");
		// using join() method
		t1.start();
		//But join() solution is same as using 3 main at different time so no benefit of using thread
 		t1.join(); // wait for t1 to complete
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		// serial execution in which one thread run and wait for it to complete  
	}

}
