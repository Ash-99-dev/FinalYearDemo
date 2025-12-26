package com.Encapsulation;

class eEmployees{
	private String name;
	private int emp_id;
	private int salary;
	/*public eEmployees(String name, int emp_id, int salary) {
		name = name;
		emp_id = emp_id;   //This is shadowing problem with overlapping name variable to solve 'this' is used
		salary = salary;
	}*/
	public eEmployees(String name, int emp_id, int salary) {
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
public class ShadowingProblem {

	public static void main(String[] args) {
		eEmployees s = new eEmployees("Ash", 131, 50000);
		System.out.println("Employee name: "+s.getName()+", Employee id: "+s.getEmp_id()+", Salary: "+s.getSalary());

	}

}