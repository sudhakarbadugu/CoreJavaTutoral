import java.util.*;

public class ComparableDemo {

	public static void main(String s[]){
		Student s1 = new Student(5, "Sudha");
		Student s2 = new Student(2, "Ram");
		Student s3 = new Student(7, "Midhun");
		Student s4 = new Student(10, "Brand");
		Student s5 = new Student(1, "Karthik");
		
		List list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		int r1 = s1.compareTo(s2);
		System.out.println(r1);
		
		int r2 = s1.compareTo(s4);
		System.out.println(r2);
		
		int r3 = s1.compareTo(new Student(5, "Ab"));
		System.out.println(r3);
		
		
		TreeSet ts = new TreeSet(list);
		
		System.out.println(ts);
	}
}

class Student implements Comparable{
	int rollNo;
	String name;
	
	Student(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
	}
	
	public String toString(){
		return "rollNo:"+ rollNo + " name:"+ name;
	}
	
	// public int compareTo(Object o){
		// Student s1 = (Student) o;
		// int rollNo1 = s1.rollNo;
		// //return Integer.valueOf(rollNo).compareTo(s.rollNo);
		
		// int result = 0;
		// if(rollNo == rollNo1){
			// result = 0;
		// }
		// else if(rollNo > rollNo1){
			// result = 1;
		// }
		// else if(rollNo < rollNo1) {
			// result = -1;
		// }
		
		// return result;
	// }
	public int compareTo(Object o){
		Student s1 = (Student) o;
		String name1 = s1.name;
		//return Integer.valueOf(rollNo).compareTo(s.rollNo);
		return name.compareTo(name1);
	}
}