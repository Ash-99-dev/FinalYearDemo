package CollectionFramework;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(9);
		al.add(100);
		al.add(130);
		al.add("Ashmit");
		al.add('A');
		al.add(250.6);
		al.add(true);
		System.out.println("List 1 => "+al);
		ArrayList al1 = new ArrayList(9);
		al1.add(10);
		al1.add(13);
		
		al1.add("Ash");
		System.out.println("List 2 => "+al1);
		al.addAll(1,al1);
		System.out.println("List 1 => "+al);
		System.out.println(al.containsAll(al1));
		// Set - replace
		al.set(0, 10);
		// Retain All - Perform Inner join
		al.retainAll(al1);
		System.out.println("Retain List 1 => "+al);
		al.clear();
		al1.clear();
	}

}
