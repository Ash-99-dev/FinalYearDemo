package com.abstractMethod;

abstract class Bird{
	abstract void eat();
	abstract void fly();
	Bird(){
		System.out.println("abstract Bird constructor");
	}
}
abstract class Sparrow1 extends Bird{
	void fly() {
		System.out.println("Flying");
	}
}
class VegSparrow1 extends Sparrow1{
	void eat() {
		System.out.println("Eating Vegitarian");
	}
}
class nonVegSparrow1 extends Sparrow1{
	void eat() {
		System.out.println("Eating Non-Vegitarian");
	}
}
public class Abstract_2 {

	public static void main(String[] args) {
		duty(new VegSparrow1());
		duty(new nonVegSparrow1());
	}
	static void duty(Bird b) {	
		b.eat();
		b.fly();
	}
}
