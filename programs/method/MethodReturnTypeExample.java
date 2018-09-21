class MethodReturnTypeExample {

	public static void main(String[] args){
		int result = MethodReturnTypeExample.add(10, 20);
		System.out.println(result);
		
		String s = MethodReturnTypeExample.getName();
		System.out.println(s);
		
		
		//int a = MethodReturnTypeExample.m1(); ce:MethodReturnTypeExample.java:10: error: incompatible types: void cannot be converted to int
		
		MethodReturnTypeExample mrt = new MethodReturnTypeExample();
		short s1= 220, s2 = 45;
		int c = mrt.sub(s1, s2);
		System.out.println(c);
		
		float d = MethodReturnTypeExample.multiply(10.2f, 24.0f);
		System.out.println(d); 
	}
	
	public static float multiply(float a, float b){
		float c = a * b;
		return c;
	}
	
	//declaration.
	public int sub(short a, short b){
		int c = a - b;
		
		return c;
	}
	
	
	
	public static int add(int a, int x){
		int c = a + x;
		
		return c;
	}
	
	public static String getName(){
		return "sudhakar";
	}
	
	
	public static void m1(){
		//return "sudhakar";
	}
}