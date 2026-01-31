package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyOnRightArrayJava {

	public static void main(String[] args) {
		CopyOnWriteArrayList al = new CopyOnWriteArrayList();
		al.add(100);
		al.add(50);
		al.add(25);
		al.add(75);
		al.add(125);
		
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());  // read value
			al.add(7);   // write value    only used when we want to read and write which is not allowed in for or any other loop
			
		}
		Iterator itr2 = al.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		//System.out.println(al);
	}

}
