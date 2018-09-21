class MethodChainDemo {
	
	private static void add(int a, int b){
		int z = a + b;
		System.out.println("Add:"+ z);
		
		m1();
		
		MethodChainDemo md = new MethodChainDemo();
		md.m2();
	}
	
	private static void m1(){
		System.out.println("m1");
	}
	
	private void m2(){
		System.out.println("m2");
	}
	
	public static void main(String args[]){
		System.out.println("main method");
		
		add(0, 20);
		
		System.out.println("End");
	}
}