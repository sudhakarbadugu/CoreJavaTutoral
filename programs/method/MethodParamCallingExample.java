class MethodParamCallingExample {
	public static void main(String... args){
		System.out.println("main");
		
		MethodParamCallingExample mpe = new MethodParamCallingExample();
		mpe.m1("s");
		
		MethodParamCallingExample.add(10, 40);
	}
	
	public void m1(String s){
		System.out.println("m1 "+ s);
	}
	
	public static void add(int a, int b){
		int c = a + b;
		System.out.println("add "+ c);
	}
}