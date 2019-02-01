import java.util.*;
 class LinkedList1{
	public static void main(String[] args){
		LinkedList e=new LinkedList();
		e.add(45);
		e.add("murali");
		e.add("vijay");
		e.add(92);
		e.add(12.3f);
		System.out.println(e);
		List r=new LinkedList();
		 r.addAll(r);
		 System.out.println(e);
		 r.add("siri");
		 System.out.println(r);
		r.removeAll(e);
		System.out.println(r);
		r.retainAll(e);
		System.out.println(r);
		r.get(8);
		System.out.println(r);
		 e.removeFirst();
		 System.out.println(e);
		Object g= e.clone();
		System.out.println(e);
	
	
	}

}