import java.util.*;

class HashMapDemo {
	public static void main(String[] args){
		HashMap map = new HashMap(10);
		
		map.put("Telugu", 70);
		map.put("English", 80);
		map.put("Math", 70);
		map.put("Sci", 60);
		map.put("Social", 90);
		map.put("Social", 95);
		map.put("a", null);
		map.put(null, null);
		map.putIfAbsent(null, 1); 
		
		
		HashMap map1 = new HashMap(map);
		
		map1.remove(null);
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




















