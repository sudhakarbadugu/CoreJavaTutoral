import java.util.*;

class HashtableDemo {
	public static void main(String[] args){
		Hashtable map = new Hashtable();
		
		map.put("Telugu", 70);
		map.put("English", 80);
		map.put("math", 70);
		map.put("Sci", 60);
		map.put("Social", 90);
		map.put("Social", 95);
		// map.put(50, 95);
		// map.put("a", null);		
		
		Hashtable map1 = new Hashtable(map);

		map1.put("a", 50);
		
		boolean isExist = map1.containsKey("a");
		System.out.println(isExist);
		
		boolean valueExist = map1.containsValue(150);
		System.out.println(valueExist);
		
		Object value = map1.get("Telugu");
		System.out.println("Telugu " +value);
		
		Object value1 = map1.get("Phy");
		System.out.println("Phy " + value1);		

		value1 = map1.getOrDefault("Phy", 35);
		System.out.println("Default Phy " + value1);
		
		Collection c = map1.values();
		
		Set set = map1.keySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()){
			String subject = (String)i.next();
			Object subjectValue = map1.get(subject);
			System.out.println("Subject: "+ subject + " value:"+ subjectValue);
		}
		
		
		System.out.println(c);
		System.out.println(set);
		
		System.out.println(map);
		System.out.println(map1);
	}
}

class StringComparator implements Comparator {
	public int compare(Object o1, Object o2){
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		return s1.compareToIgnoreCase(s2);
	}
}



