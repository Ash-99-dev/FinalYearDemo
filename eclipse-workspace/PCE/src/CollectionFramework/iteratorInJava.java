package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorInJava {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(9);
		al.add(100);
		al.add(50);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}

}
