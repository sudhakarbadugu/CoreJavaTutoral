import java.util.*;
	class TreeSet4{
		public static void main(String[] args){
			TreeSet l=new TreeSet();
			l.add(90);
			l.add(80);
			l.add(70);
			l.add(60);
			// System.out.println(l);
		
		 String[] names={"murali","sudhakar","prasad","venkaiah","prasad"};
				 System.out.println(Arrays.toString(names));
				 System.out.println(names[names.length-1]);
			 LinkedHashSet k=new LinkedHashSet();
				 for(String s:names){
				 boolean vijay=k.add(s);
				if(vijay==false){
				 System.out.println(s);
				 }
				  System.out.println(l);
		}
	 }
	 }