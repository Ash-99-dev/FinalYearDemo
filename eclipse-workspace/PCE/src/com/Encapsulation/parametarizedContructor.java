package com.Encapsulation;

class mEmployee{
	int emp_id;
	String name;
	int salary;
	public mEmployee(int emp_id, String name, int salary) {
		this.emp_id = emp_id;
		this.name = name;
		this.salary = salary;
	}
	public mEmployee() {
		super();
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
public class parametarizedContructor {

	public static void main(String[] args) {
		mEmployee e = new mEmployee();
		System.out.println(e.getEmp_id());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		
		
		mEmployee e1 = new mEmployee(101,"Ash",90);
		System.out.println(e1.getEmp_id());
		System.out.println(e1.getName());
		System.out.println(e1.getSalary());
		
	}

}
