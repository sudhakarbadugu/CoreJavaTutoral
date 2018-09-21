class PojoDemo {
	private int age;
	private String name;
	private int salary;
	
	public static void main(String... ar){
		PojoDemo p = new PojoDemo();
		
		p.setAge(20);
		p.setName("Sudha");
		p.setSalary(10000);
		
		p.printValues(p);
	}
	
	private void printValues(PojoDemo p){
		System.out.println(p.age);
		System.out.println(p.name);
		System.out.println(p.salary);
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public void setName(String a){
		name = a;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}

}