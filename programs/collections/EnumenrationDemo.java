import java.util.*;
class EnumenrationDemo {
	public static void main(String[] args){
		Vector ab = new Vector(100);
		ab.add("Sudha");
		ab.add("MLA");
		ab.add("CM");
		
		System.out.println("Before:" + ab);		
		Enumeration li = ab.elements();
		
		while(li.hasMoreElements()){
			
			Object o = li.nextElement();
			System.out.println(o);
		}

		System.out.println("After:" + ab);
		
	}
 }