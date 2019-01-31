import java.util.*;

public class LinkedListDemo {
	public static void main(String[] args){
		List l = new LinkedList();
		
		l.add(60);
		l.add(90);
		l.add(60);
		l.add(70);
		l.add(56);
		l.add(45);
		l.add(45);
		l.add(45);
		l.add(45);
		l.add(34);
		
		l.add(11);
		System.out.println(l);
		 l.add(0, 1);
		
		 System.out.println(l);
		 System.out.println(l.get(3));
		 System.out.println(l.size());
		 System.out.println(l.isEmpty());
		
		 l.set(0, 90);
		 
		 System.out.println(l);
		
		LinkedList l2 = new LinkedList();
		l2.addAll(l);
		System.out.println(l2);
	 
		Object l3 = l2.clone();
		
		System.out.println(l3);
		
		l2.add("Sudhakar");		
		System.out.println(l2);
		
	//	l2.removeAll(l);
		l2.retainAll(l);
		
		System.out.println(l2);
		System.out.println(l);

		l2.addFirst("Sudhakar");
		l2.addLast("Sudhakar");
		
		Object[] obj = l.toArray();
		l2.removeFirstOccurrence("Sudhakar");
		System.out.println(l2);
		
		for(Object o : obj){
			System.out.println(o);
		}
	}
}