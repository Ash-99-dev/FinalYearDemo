package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(9);
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
