package CollectionFramework.collectionLoops;

import java.util.ArrayList;
import java.util.Iterator;

public class forVsIterator {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(25);
		al.add(75);
		al.add(125);
		// return error because array size increase dynamically so we use iterator so no changes are allowed
		/*System.out.println("----Using For Loop------");
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
			al.add(i);
		}*/
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			al.add(7);  //throws error because it cannot be modified
			al.add(17);
		}
	}

}
