class Person5{
    private int age;
	private String name;
	private String motherName;
	public static void main(String...h){
		Person5 ab=new Person5();
		ab.printValue(ab);
		
		    ab.setAge(22);
			ab.setName("murali");
			
			ab.printValue(ab);
			ab.setmotherName("adhemma");
			ab.printValue(ab);
	}

	
	private void printValue(Person5 ab){		
		System.out.println(ab.age);
		System.out.println(ab.name);
		System.out.println(ab.motherName);
	}
	public void setAge(int age){
		this.age=age;
	}
	public void setName(String s){
		name=s;
	}
	public void setmotherName(String h){
		this.motherName=h;
	}
}
