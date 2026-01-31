package CollectionFramework.legacyClasses;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

public class everyLoopMerged {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(25);
		al.add(75);
		al.add(125);
		
		System.out.println("----Using For Loop------");
		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("----Using Enhanced For (ForEach)------");
		for(Object arr:al) {
			System.out.println(arr);
		}
		System.out.println("\n----Using Iterator------");
		Iterator itr1 = al.iterator();
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+" ");
		}
		System.out.println("\n----Using ListIterator------");
		ListIterator itr2 = al.listIterator(al.size());
		while(itr2.hasPrevious()) {
			System.out.print(itr2.previous()+" ");
		}
		/*System.out.println("----Using Descending Iterator------");
		Iterator itr3 = al.descendingIterator();
		while(itr3.hasNext()) {
			System.out.print(itr2.next()+" ");
		}*/
		
		/*System.out.println("----Using Enumerator------");
		Enumeration en = al.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}*/
	}

}
