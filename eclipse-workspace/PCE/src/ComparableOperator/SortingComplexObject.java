package ComparableOperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class Student0 implements Comparable{
	String name;
	int age;
	int  salary;
	 
	 public Student0(String name, int age , int salary) {
		 this.name=name;
		 this.age=age;
		 this.salary=salary; 
	 }
	 
	 String getName() {
		 return name;
	 }
	 int getAge() {
		 return age;
	 }
	int getSalary() {
		return salary;
	}
	public String toString() {
		return name + " " + age+" "+salary;
	}

	
	

 //using comparable interface 
	@Override
	public int compareTo(Object o) {
		if(this.salary>((Student0)(o)).salary) {
			return 1;
		}else
		return -1;
	}
	
	
}	

	//using Comparator interface 
	
	class  SortComplexObject implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			if(((Student0)(o1)).name.compareTo(((Student0)(o2)).name)>0) {
				return 1;
			}
			return -1;
		}
		
	}
	
	
public class SortingComplexObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student0 s1 = new Student0("Ashmit",21 , 3455);
		Student0 s2 = new Student0("Tuntun",21 , 3455);
		Student0 s3 = new Student0("Shubham",21 , 3455);
		ArrayList al=new ArrayList();
		al.add(s2);
		al.add(s1);
		al.add(s3);
		
		SortComplexObject st = new SortComplexObject();
		Collections.sort(al, st);
		
		System.out.println(al);

		
	}
 }

