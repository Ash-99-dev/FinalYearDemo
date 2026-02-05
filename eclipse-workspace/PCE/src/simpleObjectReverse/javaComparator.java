package simpleObjectReverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class javaComparator {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(250);
		al.add(10);
		al.add(50);
		al.add(30);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Comparator c = Collections.reverseOrder();
		Collections.sort(al, c);
		System.out.println(al);
	}

}
