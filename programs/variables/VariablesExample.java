class VariablesExample {
	int age = 30;
	static String collegeName = "SV"; 
			
	public static void main(String... args){
		VariablesExample ve = new VariablesExample();
		ve.m1();
		ve.m2();
		
		VariablesExample.m3();
	}
	
	public void m1(){
		int salary = 20000;
		System.out.println(age);
		System.out.println(VariablesExample.collegeName);
		System.out.println(salary);
	}
	
	public void m2(){
		//System.out.println(salary);
		System.out.println(age);
		System.out.println(VariablesExample.collegeName);
	}
	
	public static int m3(){
		VariablesExample e = new VariablesExample();
		System.out.println(e.age);
		System.out.println(collegeName);
		
		return e.age;
	}
}