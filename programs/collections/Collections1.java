import java.util.*;

class Collections1{
	public static void main(String args[]){
		List s = new ArrayList();
		s.add(56);
		s.add(57);
		s.add(29);
		s.add(7);
		
		System.out.println(s);
		
		List synchronizedList = Collections.synchronizedList(s);
		System.out.println(synchronizedList);
		
		Collections.sort(s);
		Collections.sort(s, new NumComparator());
		System.out.println(s);
	}
}

class NumComparator implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2){
		return i2.compareTo(i1);
	}
}