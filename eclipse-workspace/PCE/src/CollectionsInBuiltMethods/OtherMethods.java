package CollectionsInBuiltMethods;

import java.util.ArrayList;
import java.util.Collections;

public class OtherMethods {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(250);
		al.add(10);
		al.add(30);
		al.add(30);
		al.add(50);
		al.add(30);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(Collections.binarySearch(al, 50));
		System.out.println(Collections.binarySearch(al, 999));
		Collections.rotate(al, 1);
		System.out.println("After Rotation => "+al);
		System.out.println("Minimum Value => "+Collections.min(al));
		System.out.println("Maximum Value => "+Collections.max(al));
		System.out.println("Number of times it occured is => "+Collections.frequency(al, 30));
		Collections.replaceAll(al, 30, 99);
		System.out.println(al);
		Collections.shuffle(al);
		System.out.println(al);
	}

}
