package CollectionFramework;

import java.util.ArrayList;

public class enhancedArrayList {

	public static void main(String[] args) {
		// For Loop vs For Each loop
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175); 
		System.out.println(al);
		System.out.println("For Loop -> ");
		for(int i = 0; i < al.size(); i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		System.out.println("For Each->");
		for(Object x: al) {
			System.out.print(x+" ");
		}
	}

}
