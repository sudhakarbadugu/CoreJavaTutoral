/*
* This class is an example for method calling.	
*/
class MethodCallingExample {
	public static void main(String[] args){
		System.out.println("main");
		MethodCallingExample.m3("sudha");
	}
	
	public void m2(int a, String b){
		System.out.println("m2 "+ a );
		System.out.println("m2 "+ b );
		MethodCallingExample mce = new MethodCallingExample();
		mce.m5();
	}

	public void m5(){
		System.out.println("m5");
		MethodCallingExample.m4();
	}
	
	public static void m4(){
		System.out.println("m4");
	}	
	
	public static void m1(){
		System.out.println("m1");
		
		MethodCallingExample mce = new MethodCallingExample();
		mce.m2(22, "Sudha");
	}
		
	public static void m3(String name){
		System.out.println("m3" + name);
		MethodCallingExample.m1();
	}
}