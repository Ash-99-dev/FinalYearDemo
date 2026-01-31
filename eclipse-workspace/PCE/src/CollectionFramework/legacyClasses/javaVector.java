package CollectionFramework.legacyClasses;

import java.util.Enumeration;
import java.util.Vector;

public class javaVector {

	public static void main(String[] args) {
		Vector al = new Vector();
		al.add(100);
		al.add(50);
		al.add(25);
		al.add(75);
		al.add(125);
		
		Enumeration el = al.elements();  // only used with vector because its older and Iterator is newer(advanced)
		while(el.hasMoreElements()) {
			System.out.println(el.nextElement());
		}
	}

}
