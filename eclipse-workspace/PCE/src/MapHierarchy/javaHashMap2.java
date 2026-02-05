package MapHierarchy;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class javaHashMap2 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(1, "1 number");
		hm.put(2, "2 number");
		hm.put(3, "3 number");
		hm.put(4, "4 number");
		hm.put(5, "5 number");
		System.out.println("\nDisplay only Keys=> "+hm.keySet());
		System.out.println("\nDisplay only values=> "+hm.values());
		System.out.println("\nDisplay both Keys&Values => "+hm.entrySet());
		System.out.println(hm);
		
		System.out.println("\n\tUsing Iterators\n");
		// Similarly entrySet() with set
		Set s = hm.keySet();
		Iterator itr = s.iterator();
		System.out.println("\n\n\tKeys are: ");
		while(itr.hasNext()) {
			System.out.print(itr.next()+",");
		}
		
		Collection cv = hm.values();
		
		Iterator itr1 = cv.iterator();
		System.out.println("\n\n\tValues are: ");
		while(itr1.hasNext()) {
			System.out.print(itr1.next()+",");
		}
		
		Set sE = hm.entrySet();
		Iterator itr2 = sE.iterator();
		System.out.println("\n\n\tKey<Value> are: ");
		while(itr2.hasNext()) {
			System.out.print(itr2.next()+", ");
		}
	}

}
