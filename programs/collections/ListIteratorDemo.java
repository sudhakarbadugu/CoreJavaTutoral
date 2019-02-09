import java.util.*;
class ListIteratorDemo {
	public static void main(String[] args){
		ArrayList ab = new ArrayList(100);
		ab.add("Sudha");
		ab.add("MLA");
		ab.add("CM");
		
		System.out.println("Before delete:" + ab);		
		ListIterator li = ab.listIterator();
		
		while(li.hasNext()){
			
			Object o = li.next();
			if("Sudha".equals(o)){
				li.set("Sudhakar");
			}

			if("CM".equals(o)){
				li.add("Chandrababu");
			}
				
			if("MLA".equals(o)){
				li.remove();
			}
			
		}

		System.out.println("After delete:" + ab);
		
	}
 }