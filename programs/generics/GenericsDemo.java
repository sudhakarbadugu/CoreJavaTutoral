import java.util.*;

class GenericsDemo {

	public static void main(String[] args){
		int[] a = new int[5];
		
		a[0] = 10;
		//a[1] ="Sudhaar";	//type safe
		
		for(int i=0; i<a.length; i++) {
			int x = a[i];
			System.out.println(x * x);	
		}

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(20);
		//l.add("Sudha"); //type safe
	
		ArrayList<String> l1 = new ArrayList<String>();
		// l1.add(20);
		l1.add("Sudha"); //type safe
		
		for(int j=0; j<l.size(); j++) {
			int y = l.get(j);
			System.out.println(y * y);
		}
		
	}
}