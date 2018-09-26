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
	
	public void setName(String s){
		name = s;
	}
	
	//setter
	public void setAge(int a){
		age = a;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getFatherName(){
		return fatherName;
	}
	
	public void setFatherName(String fatherName){
		this.fatherName = fatherName;
	}
	
	public void setMotherName(String m){
		this.motherName = m;
	}
	
	public String getMotherName(){
		return motherName;
	}
		
	public String getParents(){
		return fatherName;
	}
	
	
	public static void main(String[] args){
		Person p1 = new Person();
		printValues(p1);
		
		System.out.println("****************");
		
		// p1.name = "Sudhakar";
		p1.setName("Sudhakar");
		// p1.motherName = "lakshmi";
		p1.setMotherName("Lakshmi"); 
		p1.villageName ="chennai";
		p1.setFatherName("Madhav");
		p1.setAge(45);
		
		printValues(p1);
		
		System.out.println("****************");
		Person p2 = new Person();
		p2.name ="Venky";
		p2.setFatherName("Venkat");
		p2.motherName="ademma";
		
		printValues(p2);
	}
	
	public static void printValues(Person p){
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getFatherName());
		System.out.println(p.getMotherName());
		System.out.println(villageName);
	}
}