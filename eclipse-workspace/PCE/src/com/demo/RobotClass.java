package com.demo;

class Robot{
	String brand;
	String os;
	String micro_p;
	Robot(String brand, String os, String micro_p){
		this.brand = brand;
		this.os = os;
		this.micro_p  = micro_p;
	}
	void move() {
		System.out.println("The robot of brand:\'"+brand+"\' & OS/micro_p:\'"+os+"/"+micro_p+"\' is moving");
	}
	void fight() {
		System.out.println("The robot of brand:\'"+brand+"\' & OS/micro_p:\'"+os+"/"+micro_p+"\' are fighting");
	}
}
public class RobotClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot r1 = new Robot("iRobot","iRobot_OS","v6");
		r1.move();
		r1.fight();
		Robot r2 = new Robot("HoneyBee","Bee_OS","v4");
		r2.move();
		r2.fight();
	}

}
