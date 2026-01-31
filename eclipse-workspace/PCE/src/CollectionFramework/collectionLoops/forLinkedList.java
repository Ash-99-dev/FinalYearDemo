package CollectionFramework.collectionLoops;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class forLinkedList {

	public static void main(String[] args) {
		LinkedList al = new LinkedList();
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
		Iterator iterator = al.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println("\n----Using ListIterator------");
		ListIterator listiterator = al.listIterator(al.size());
		while(listiterator.hasPrevious()) {
			System.out.print(listiterator.previous()+" ");
		}
		System.out.println("----Using Descending Iterator------");
		Iterator descIterator = al.descendingIterator();
		while(descIterator.hasNext()) {
			System.out.print(descIterator.next()+" ");
		}
		
		/*System.out.println("----Using Enumerator------");
		Enumeration en = al.element();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}*/
	}

}
