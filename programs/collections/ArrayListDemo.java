import java.util.*;

public class ArrayListDemo {
	public static void main(String[] args){
		List l = new ArrayList();
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
		
		ArrayList l2 = new ArrayList();
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

		Object[] obj = l.toArray();
		System.out.println(obj);
		
		for(Object o : obj){
			System.out.println(o);
		}
	}
}