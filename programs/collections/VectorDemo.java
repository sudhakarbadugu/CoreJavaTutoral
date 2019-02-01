import java.util.*;

public class VectorDemo {
	public static void main(String[] args){
		List l = new Vector(30);
		 l.add(45);
		 l.add(45);
		 l.add(34);
		
		 System.out.println(l.size());
		 System.out.println(l.isEmpty());
		
		 l.set(0, 90);
		Vector v = (Vector) l;
		v.addElement("Sudhakar");
		v.insertElementAt("Ram", 3);
		
		v.setElementAt(90, 1);
		
		System.out.println(v.capacity());
		System.out.println(v.elementAt(1));
		System.out.println(v);
		
		List subList = v.subList(3, 5);
		System.out.println(subList);
	}
}