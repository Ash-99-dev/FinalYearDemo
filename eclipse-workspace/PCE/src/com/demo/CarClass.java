package com.demo;

class Car{
	String color;
	String brand;
	String engine;
	Car(String brand, String color, String engine){
		this.brand = brand;
		this.color = color;
		this.engine  = engine;
	}
	void running() {
		System.out.println("Running Car brand:\'"+brand+"\',\n\t color:\'"+color+"\',\n\t Engine:\'"+engine+"\'");
	}
	void self_driving() {
		System.out.println("Automatic Car brand:\'"+brand+"\',\n\t color:\'"+color+"\',\n\t Engine:\'"+engine+"\'");
	}
}
public class CarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car r1 = new Car("Tesla","Mat Black","v6");
		r1.self_driving();
		r1.running();
		Car r2 = new Car("Tata","Gray","v4");
		r2.self_driving();
		r2.running();
	}

}
