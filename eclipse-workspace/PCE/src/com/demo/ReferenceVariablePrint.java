package com.demo;
class aStudent{
	String name;
}
class useStudent{
aStudent dipStudent() {
	aStudent s = new aStudent();
		return s;
	}
}
public class ReferenceVariablePrint {

	public static void main(String[] args) {
		/*aStudent as1 = new aStudent();
		System.out.println(as1);*/
		useStudent us = new useStudent();
		aStudent res = us.dipStudent();
		System.out.println(res);
	}
	
	

}
