import java.util.*;
	class LinkedList2{
	public static void main(String[] args){
		LinkedList k=new LinkedList();
		k.add("java");
		k.add("vamsi");
		k.add("hari");
		k.add("basha");
		k.add("siri");
		System.out.println(k);
		k.remove("basha");
		k.remove(0);
		System.out.println(k);
		k.addAll(k);
		System.out.println(k);
		k.removeAll(k);
		System.out.println(k);
		// LinkedList d=new LinkedList();
		// d.removeFirst(d);
		// System.out.println(k);
		k.clear();
		System.out.println(k);
		k.removeFirstOccurance();
		System.out.println(k);
		
	}
	}