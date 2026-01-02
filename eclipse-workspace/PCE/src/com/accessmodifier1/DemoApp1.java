package com.accessmodifier1;

//import interface19day.KodCalci;

public class DemoApp1 {
	public int a ;
	protected int b;
	int c;
	private int d;
	public static void main(String[] args) {
		DemoApp1 d1 = new DemoApp1();
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.c);
		System.out.println(d1.d);
	}

}

class Demo1{
	void disp1() {
		DemoApp1 d1 = new DemoApp1();
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.c);
		//System.out.println(d1.d);
	}
}
class Demo2 extends DemoApp1{
	void disp2() {
		DemoApp1 d1 = new DemoApp1();
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.c);
		//System.out.println(d1.d);
	}
}
