import java.util.*;
class TreeMapExample{
    public static void main(String...q) {
		StringComparator scm = new StringComparator();
		Comparator normal = String.CASE_INSENSITIVE_ORDER;
		Comparator reversed = String.CASE_INSENSITIVE_ORDER.reversed();
	    TreeMap t = new TreeMap();
		  t.put("lenono",60000);
		  t.put("notepad",9000);
		  t.put("thinkpad",23460);
		  t.put("dell",6340);
		  t.put("hp",6210);
		  t.put("Samsung",6650);
		  t.put("ipad",8440);
		 
		  System.out.println(t);
		  TreeMap t1 =new TreeMap(t) ;
		  t1.put("laptops",7);
		  boolean b1=t1.containsKey("laptops");
		  System.out.println(b1);
		  boolean b2=t1.containsKey("accesaries");
		  System.out.println(b2);
		  Object g=t1.get("accesaries");
		  System.out.println("accesaries" +g);
		  Object g1=t1.getOrDefault("accesaries",19);
		  System.out.println("ram:" +g1);
		  Object g2=t1.getOrDefault("murali",4);
		  System.out.println("murali:" +g2);
		  Collection c = t1.values();
		  Set set = t1.keySet();
		  Iterator i=set.iterator();
		  while(i.hasNext()){
			       String subject=(String)i.next();
				   String  subjectValue=t1.get(subject).toString();
				   System.out.println("Subject: "+ subject + " value:"+ subjectValue);
			}
		 System.out.println(c);
	     System.out.println(set);
		 System.out.println(t1);
		 System.out.println(t);
		  
	}
}
class StringComparator implements Comparator {
	public int compare(Object o1, Object o2){
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return s2.compareToIgnoreCase(s1);
	}
}

