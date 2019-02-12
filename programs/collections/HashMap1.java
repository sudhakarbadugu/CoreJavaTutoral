import java.util.*;
	class HashMap1{
			public static void main(String[] args){
			   HashMap m=new HashMap();
			   m.put("sc",60);
			   m.put("bc",80);
			   m.put("oc",90);
			   m.put("st",60);
			   m.put("a",null);
			 System.out.println(m);
			 HashMap n=new HashMap(m);
			 n.remove(null);
			 System.out.println(n);
			boolean  l=n.containsKey("st");
			System.out.println(l);
			System.out.println(n.containsKey(60));
			System.out.println(n.containsValue(null));
			Object s=n.get("sc");
			System.out.println("sc"+ s);
			System.out.println("st:"+s);
			Object k=n.get("other");
			System.out.println(k);
			Set kl=n.keySet();
			Iterator o=kl.iterator();
			while(o.hasNext()){
			String cast=(String)o.next();
			Object castWise =n.get(cast);
			System.out.println("cast:"+ cast +"value:"+ castWise);
			System.out.println(n);
			Object sa=n.getOrDefault(n,90);
			System.out.println(sa);
						}
			}
	}