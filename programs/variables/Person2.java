class Person2 {
	private int age;
	private String name;
	public static String collegeName;
	private String fatherName;
	private String motherName;
	
	public static void main(String args[]){
		System.out.println("main "+ collegeName);
		
		Person2 p1=new Person2();
		p1.age = 29;
		p1.name= "Sudhakar";
		p1.collegeName = "Abc";
		p1.fatherName ="madhav";
		p1.motherName="lakshmi";
		
		Person2 p2=new Person2();
		p2.age=24;
		p2.name= "Murali";
		p2.collegeName="sv arts";
		p2.fatherName="venkat";
		p2.motherName="adhemma";
		
		Person2 p3=new Person2();
		p3.age=23;
		p3.name="prasad";
		p3.collegeName="audisankara";
		p3.fatherName="chandra";
		p3.motherName="ranemma";
		Person2 p4 =new Person2();
		
		System.out.println("p1" + p1.collegeName);
		System.out.println("p2" + p2.collegeName);
		System.out.println("p3" + p3.collegeName);
	    System.out.println("p1" +p1.fatherName);
		System.out.println("p2" + p2.fatherName);
		System.out.println("p3"+p3.fatherName);
		
        System.out.println("p1" + p1.motherName);
	    System.out.println("p2" + p2.motherName);
	    System.out.println("p3" + p3.motherName);
	
		System.out.println(p1.age +" " +p1.name);
		System.out.println(p2.age +" " +p2.name);
		System.out.println(p3.age +" " +p3.name);
		System.out.println(p4.age +" " +p4.name);
		System.out.println(p1.age +" "+p1.name);
		System.out.println(p2.age +" "+p2.name);
		System.out.println(p3.age +" "+p3.name);
		System.out.println(p4.age +" "+p4.name);
		m1();
		
	}
	
	public static void m1(){
		System.out.println("m1: "+ collegeName);
	}
}
