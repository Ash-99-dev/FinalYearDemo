package CollectionFramework;

import java.util.LinkedHashSet;

public class linkedHashSetDemo {
// in hashSet the output is unpredictable
	public static void main(String[] args) {
		LinkedHashSet hs = new LinkedHashSet();
		hs.add(100);
		hs.add(50);
		hs.add(150);
		hs.add(25);
		hs.add(75);
		hs.add(125);
		hs.add(175);
		System.out.println(hs.getFirst());
		System.out.println(hs);
	}

}
