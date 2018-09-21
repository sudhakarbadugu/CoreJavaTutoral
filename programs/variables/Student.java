class Student {
	private int age;
	private String name;
	
	public static String collegeName;
	
	public static void main(String args[]){
		System.out.println("main "+ collegeName);
		
		Student s1 = new Student();
		s1.age = 29;
		s1.name= "Sudhakar";
		s1.collegeName = "Abc";
				
		
		Student s2 = new Student();
		s2.age = 22;
		s2.name= "Murali";
		s2.collegeName = "My coleage";
		
		Student s3 = new Student();
		
		
		System.out.println("s1" + s1.collegeName);
		System.out.println("s2" + s2.collegeName);
		
		System.out.println(s1.age +" " +s1.name);
		System.out.println(s2.age +" " +s2.name);
		System.out.println(s3.age +" " +s3.name);
		m1();
		
	}
	
	public static void m1(){
		System.out.println("m1: "+ collegeName);
	}
}
