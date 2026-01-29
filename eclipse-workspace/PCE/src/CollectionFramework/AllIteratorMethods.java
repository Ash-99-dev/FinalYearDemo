package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class AllIteratorMethods {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		
		System.out.println("------------Iterator-------------");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("------------List Iterator-------------");
		
		Iterator litr = al.listIterator();
		while(litr.hasNext()) {
			System.out.print(litr.next()+" ");
		}
		System.out.println();
		System.out.println("------------Backward List Iterator-------------");
		
		ListIterator itr1 = al.listIterator(al.size());
		while(itr1.hasPrevious()) {
			System.out.print(itr1.previous()+" ");
		}
		
		System.out.println();
		
		//Decsending iterator is not present(Not Support) in arrayList so we used LinkedList
		System.out.println("--------Descending Iterator---------");
		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add(50);
		ll.add(150);
		ll.add(25);
		ll.add(75);
		ll.add(125);
		ll.add(175);
		
		Iterator itr2 = ll.descendingIterator();
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+" ");
		}
	}

}