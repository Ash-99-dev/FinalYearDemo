package CollectionFramework;

import java.util.LinkedList;
public class linkedListDemo2 {
	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add(10);
		al.add(130);
		al.add(100);
		al.addFirst(3);
		al.add(1, 9);
		al.addLast(220);
		System.out.println("get()=> "+al.getLast());
		System.out.println(al);
		
		LinkedList al1 = new LinkedList();
		al1.push(10);
		al1.push(20);
		al1.push(30);
		al1.add(77);
		System.out.println(al1);
		
		al1.pop();
		
		System.out.println(al1);
		System.out.println("Peek=> "+al1.peek());
		System.out.println("PeekFirst=> "+al1.peekFirst());
		System.out.println("PeekLast => "+al1.peekLast());
		System.out.println("Poll=> "+al1.poll());
	}
}
