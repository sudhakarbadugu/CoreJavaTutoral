class MethodDemo {
		
	public void m1(){
		int a = 10;
		int b = 20;
		int c = a + b;
		
		System.out.println("Addition" + c);
	}
	
	public static void m2(){
		System.out.println("m2");
	}
	
	public static void main(String[] args){
		System.out.println("main");
		
		MethodDemo m = new MethodDemo();
		m.m1();
		
		MethodDemo.m2();
	}
}
