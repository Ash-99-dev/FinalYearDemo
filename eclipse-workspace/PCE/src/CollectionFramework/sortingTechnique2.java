package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;

public class sortingTechnique2 {

	public static void main(String[] args) {
		// using collections.sort() method
		ArrayList<Integer> al = new ArrayList<>();
		al.add(100);
		al.add(50);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(10);
		Collections.sort(al);
		System.out.println(al);
	}

}
