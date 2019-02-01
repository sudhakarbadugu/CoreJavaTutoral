import java.util.*;

public class StackDemo {
	public static void main(String[] args){
		List l = new Stack();
		 l.add(45);
		 l.add(45);
		 l.add(34);
		
		 System.out.println(l.size());
		 System.out.println(l.isEmpty());
		
		 l.set(0, 90);
		Stack v = (Stack) l;
		v.addElement("Sudhakar");
		
		v.push("Push");
		
		System.out.println(v.peek());
		System.out.println(v);
		
	}
}