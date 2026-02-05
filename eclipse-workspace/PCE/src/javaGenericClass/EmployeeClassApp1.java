package javaGenericClass;

import java.util.ArrayList;
import java.util.stream.Collectors;

class Employee{
	String e_name;
	int salary;
	int e_id;
	Employee(String e_name,int e_id, int salary){
		this.e_name = e_name;
		this.e_id = e_id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return e_name+","+salary+", "+e_id;
	}
}
public class EmployeeClassApp1 {
// java.lang.castclass exception
	public static void main(String[] args) {
		Employee e1 = new Employee("Ashmit", 102, 12000);
		Employee e2 = new Employee("Shubham", 101, 10000);
		Employee e3 = new Employee("Ashmit", 102, 12000);
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		System.out.println(al);
		
 	}

}
