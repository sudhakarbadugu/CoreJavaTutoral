class StaticMethodParamExample {
	
	public static void main(String[] args){
		int a = 15;
		int b = 20;
		
		StaticMethodParamExample.add(a, b);
		StaticMethodParamExample.sub(23.0f, 10);
		StaticMethodParamExample.sub(22.0f, 10.9);
		StaticMethodParamExample.printName("Sudha", 29);
	}
	
	public static void add(int a, int b){
		System.out.println(a + b);
	}
	
	public static void sub(float c, int d){
		System.out.println(c - d);
	}
	
	
	public static void sub(float c, double d){
		System.out.println(c - d);
	}
	
	public static void printName(String name, int age){
		System.out.println(name);
		System.out.println(age);
	}
}
