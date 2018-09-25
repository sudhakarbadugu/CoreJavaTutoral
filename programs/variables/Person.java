class Person {
	String name;
	int age;
	String fatherName;
	String motherName;
	
	static String villageName ="karuru";
	
	//getter method
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getFatherName(){
		return fatherName;
	}
	
	public static void main(String[] args){
		Person p1 = new Person();
		printValues(p1);
		
		System.out.println("****************");
		
		p1.name = "Sudhakar";
		p1.motherName = "lakshmi";
		p1.age = 30;
		p1.age = 35;
		p1.villageName ="chennai";
		
		printValues(p1);
		
		System.out.println("****************");
		Person p2 = new Person();
		p2.name ="Venky";
		p2.fatherName= "Venkat";
		p2.motherName="ademma";
		
		printValues(p2);
	}
	
	public static void printValues(Person p){
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.fatherName);
		System.out.println(p.motherName);
		System.out.println(villageName);
	}
}