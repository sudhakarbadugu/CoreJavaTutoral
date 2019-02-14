import java.util.*;

class CollectionsDemo {
	public static void main(String args[]){
		List l = new ArrayList();
		l.add(10);
		l.add(1);
		l.add(25);
		l.add(40);
		
		System.out.println(l);
		
		List synchronizedList = Collections.synchronizedList(l);
		System.out.println(synchronizedList);
		
		Collections.sort(l);
		Collections.sort(l, new NumComparator());
		System.out.println(l);
	}
}

class NumComparator implements Comparator<Integer> {
	public int compare(Integer i1, Integer i2){
		return i2.compareTo(i1);
	}
}