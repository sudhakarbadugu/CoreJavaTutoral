import java.util.*;
	class TreeMap1{
				public static void main(String[] args){
				StringComparator lc=new StringComparator();
				 Comparator normal= String.CASE_INSENSITIVE_ORDER;
				Comparator reversed= String.CASE_INSENSITIVE_ORDER.reversed();
				 TreeMap j=new TreeMap();
				 j.put("lenovo",1909);
				 j.put("hp",10000);
				 j.put("Dell",9000);
				 System.out.println(j);
				 TreeMap lm=new TreeMap();
				 lm.put("thinkpad",76);
				 System.out.println(lm);
				 boolean st=lm.containsKey("hp");
				 System.out.println(st);
				 System.out.println(lm.firstKey());
				 Object k=j.get("dell");
				 System.out.println("dell:"+ k);
				 Object a=j.get("lenovo");
				 System.out.println("lenovo:" +a);
				 Collection c=lm.values();
				 Set set=j.keySet();
				 Iterator i=set.iterator();
				 while(i.hasNext()){
				 String company=(String)i.next();
				 String companyname=j.get(company).toString();
				 System.out.println("company:"+company+"j:"+companyname);
				 }
				 System.out.println(c);
				 System.out.println(set);
				 System.out.println(j);
				   
				}
	}
	class StringComparator implements Comparator{
		public int compare(Object o1,Object o2){
			String s1=o1.toString();
			String s2=o2.toString();
			return s2.compareToIgnoreCase(s1);
		}
	}