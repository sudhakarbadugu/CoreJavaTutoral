import java.util.*;

class GarbageCollectorDemo {

	public static void main(String[] args){
			m1();
			System.out.println("End main method");
	}
	
	public static void m1() {
		System.out.println(Runtime.getRuntime().freeMemory());
		
		Student s = new Student();
		s.age = 20;
		
		Student s1 = new Student();
		s1.age = 30;
		
		Student s3 = new Student();
		s3.age = 40;
		
		s3 = null;
		
		for(int i = 0;i < 10000 ; i++){		
			Student s4 = new Student();
			s4.age = i;
		}
		
		s1 = s;		
		System.out.println("After creating objects: before gc " + Runtime.getRuntime().freeMemory());
		
		Runtime.getRuntime().gc();
		//s1.finalize();
		System.out.println("After creating objects: after gc " + Runtime.getRuntime().freeMemory());
	}
	
	protected void finalize() {
		System.out.println("Demo Finalize called ");	
	}
}

class Student {
	int age;	//4
	String name; //
	
	protected void finalize() {
		System.out.println("Finalize called "+ age);
		System.out.println(10/0);
		
	}
}

