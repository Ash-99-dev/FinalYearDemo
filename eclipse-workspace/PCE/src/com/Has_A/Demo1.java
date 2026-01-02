package com.Has_A;

public class Demo1 {

	public static void main(String[] args) {
		Laptop l = new Laptop();
		Charger c = new Charger("HP", 32);
		l.hasA(c);
		System.out.println("***************");
		System.out.println(l.o.getbrand());
		System.out.println(l.o.getversion());
		
	}
}
class Laptop{
	os o = new os("WIN", 11.0);
	void hasA (Charger c) {
		System.out.println(c.getbrand());
		System.out.println(c.getpower());
	}
}
class Charger{
	 String brand;
	  double power;
	 public Charger(String brand,double power) {
		 super();
		 this.brand = brand;
		 this.power = power;
	 }
	  
	public String getbrand() {
		return brand;
	}
	public double getpower() {
		return power;
	}

}

class os {
	String brand;
	double version;
	
	 public os(String brand, double version) {
		 super();
	        this.brand = brand;
	        this.version = version;
	    }

	    public String getbrand() {
	        return brand;
	    }

	    public double getversion() {
	        return version;
	    }
	
	
}