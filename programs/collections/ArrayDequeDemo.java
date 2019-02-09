import java.util.*;
class ArrayDequeDemo {
	public static void main(String[] args){
		ArrayDeque ab = new ArrayDeque(100);
		ab.add("Sudha");
		ab.add("Sudhakar");
		ab.add("MLA");
		ab.add("CM");
		ab.addFirst("A");
		//ab.add(null);
		
		System.out.println(ab.peekFirst());
		System.out.println(ab);
		
		System.out.println(ab.pollLast());
		System.out.println(ab);
		
	}
 }