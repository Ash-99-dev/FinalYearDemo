package CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {
// non continuous memory allocation 
	 
	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add(10);
		al.add(130);
		al.add("Ashmit");
		al.add('A');
		al.add(25.6);
		al.add(true);
		System.out.println(al);
		al.clear();
		System.out.println(al);
	}

}
