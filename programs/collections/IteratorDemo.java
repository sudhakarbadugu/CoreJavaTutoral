import java.util.*;
class IteratorDemo {
	public static void main(String[] args){
		ArrayList ab = new ArrayList(100);
		ab.add("Sudha");
		ab.add("MLA");
		ab.add("CM");
		//ab.add(null);

		// for(Object o : ab){	//only fo reading purpose
			// if("Sudha".equals(o)){
			// //	ab.remove(o);
			// }
			
			// //ab.add(null);
			// System.out.println(o);
		// }
		
		
		System.out.println("Before delete:" + ab);		
		Iterator it = ab.iterator();
		
		boolean b = it.hasNext();
		System.out.println(b);
		
		while(it.hasNext()){
			Object o = it.next();
			if("Sudha".equals(o)){
				it.remove();
			}			
		}
	

		System.out.println("After delete:" + ab);
		
	}
 }