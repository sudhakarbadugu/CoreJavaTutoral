class MethodExample {

	public static void main(String[] args){
		System.out.println("main method");
		
		//method calling
		MethodExample object1 = new MethodExample();
		object1.m1();
		
		//Calling static methods		
		MethodExample.m3();
	}
	
	//method declaration
	public void m1(){
		System.out.println("m1 method");
		
		int a = 20;
		System.out.println(a);
	}
	
	
	public static void m3(){
		System.out.println("m2 static method");
	}
}