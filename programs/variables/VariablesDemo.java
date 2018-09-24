class VariablesDemo {
	int age = 20;
	int salary;
	boolean fName;
	static String name ="Sudhakar";
	
	
	public static void main(String[] args){
		int l  = 25;
		System.out.println(l);
		
		VariablesDemo v = new VariablesDemo();
		v.m1();
	
		m2();
	}
	
	private void m1(){
		System.out.println(age);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(fName);
	}
	
	private static void m2(){
		VariablesDemo v = new VariablesDemo();
		System.out.println(v.age);		
		System.out.println(v.salary);
		System.out.println(name);
	}
}