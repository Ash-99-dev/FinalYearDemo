package com.Encapsulation;

class e1Employees extends Object{ // object class is defaulty extended, define it or not. becs it is super class pf all class
	private String name;
	private int emp_id;
	private int salary;
	public e1Employees(String name, int emp_id, int salary) {
		this.name = name;
		this.emp_id = emp_id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	
	public int getEmp_id() {
		return emp_id;
	}
	public int getSalary() {
		return salary;
	}
}
public class javaConstructor {

	public static void main(String[] args) {
		e1Employees s = new e1Employees("Ash", 131, 50000);
		System.out.println("Employee name: "+s.getName()+", Employee id: "+s.getEmp_id()+", Salary: "+s.getSalary());

	}

}
