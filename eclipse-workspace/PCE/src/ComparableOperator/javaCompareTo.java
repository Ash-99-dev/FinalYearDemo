package ComparableOperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class  PassengerDetails implements Comparable{
	int id;
	String name;
	String deFrom;
	String to ;
	public PassengerDetails(int id, String name, String deFrom, String to) {
		super();
		this.id = id;
		this.name = name;
		this.deFrom = deFrom;
		this.to = to;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDeFrom() {
		return deFrom;
	}
	public void setDeFrom(String deFrom) {
		deFrom = deFrom;
	}
	public String getDeTo() {
		return to;
	}
	public void setDeTo(String deTo) {
		to = to;
	}
	
	@Override
	public String toString() {
		return "PassengerDetails [id=" + id + " -> name=" + name + " -> DeFrom=" + deFrom + " -> to=" + to + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		if((this.name).compareTo(((PassengerDetails)(o)).name)>0) {
			return 1;
		}else
		{
			return -1;
		}
		
	}	
}


public class javaCompareTo {

	public static void main(String[] args) {
		PassengerDetails pd1 = new PassengerDetails(101, "Ash", "Nagpur","Mum");
		PassengerDetails pd2 = new PassengerDetails(102, "Ashmit", "Nagpur","Mum");

		PassengerDetails pd6 = new PassengerDetails(106, "ashw", "nashik","Mum");

		PassengerDetails pd4 = new PassengerDetails(104, "arsh", "up","mp");

		PassengerDetails pd5 = new PassengerDetails(105, "Akash", "pune","banglore");

		PassengerDetails pd3 = new PassengerDetails(103, "Tuntun", "kolkata","Mum");

		PassengerDetails pd8 = new PassengerDetails(108, "shubham", "delhi","nagpur");

		PassengerDetails pd7 = new PassengerDetails(107, "ox", "keral","Mum");
		
		ArrayList al = new ArrayList();
		al.add(pd7);
		al.add(pd8);
		al.add(pd5);
		al.add(pd1);
		al.add(pd6);
		al.add(pd4);
		al.add(pd3);
		al.add(pd2);
		
		// before sorting 
		System.out.println(" before sorting : ");
		Iterator itr =al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println();
		System.out.println("After sorting ");
		System.out.println();
		
		Collections.sort(al);
		Iterator itr1 =al.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	
		
		
		
	}

}