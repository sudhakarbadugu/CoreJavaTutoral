import java.util.*;
class HashSetDemo{
	public static void main(String[] args){

		// interview logic to avoid duplicates
		int[] arr = {1,23, 34, 22, 22, 34, 45, 56, 34};
		HashSet h = new HashSet();
		for(int a : arr){
			h.add(a);
		}
		
		List li = new ArrayList();
		li.add(1);
		li.add(12);
		li.add(1);
		li.add(1);
		li.add(1);
		li.add(1);
		li.add(null);
		li.add(null);
		li.add(null);
		System.out.println(li);
		
		
		// h.add(34);
		// h.add(35);
		// h.add(37);
		// h.add(34);
		// h.add(35);
		// h.add(null);
		// h.add(null);
		// h.add(null);
		
		System.out.println(h);
		
	}
}