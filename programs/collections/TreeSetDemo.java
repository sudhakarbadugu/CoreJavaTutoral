import java.util.*;
class TreeSetDemo{
	public static void main(String[] args){

		TreeSet t = new TreeSet();
		t.add("Anand");
		t.add("Sudha");
		t.add("Murali");
		t.add("Prasad");
		t.add("Prasad");
		
		//t.add(12); ClassCastException
		//t.add(null); //NullPointerException
		System.out.println(t);
		
		int[] arr = {23, 2, 34, 56, 677, 86, 23, 2};
		System.out.println(Arrays.toString(arr));		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[arr.length-1]);
		
		Set t1 = new HashSet();
		int count = 0;
		for(int a : arr){
			boolean isAdded = t1.add(a);
			
			if(isAdded == false){
				System.out.println("Duplicte "+ a);
				count = count + 1;
			}
		}
		
		System.out.println(t1);
		System.out.println("Duplicate count:" + count);
		
		TreeSet t2 = new TreeSet();
		t2.add(23);
		t2.add(10);
		t2.add(0);
		t2.add(-23);
		t2.add(23);
		t2.add(203);
		
		System.out.println(t2);
	
		TreeSet t3 = new TreeSet();
		// t3.add(new StringBuffer("Sudhakar"));
		// t3.add(new StringBuffer("A"));
		// t3.add(new StringBuffer("Z"));
		
		System.out.println(t3);
	}
}
