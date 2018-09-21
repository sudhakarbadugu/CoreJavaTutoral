class MethodDemo {
	
	public static void main(String[] args){
		System.out.println("main");
		
		MethodDemo md = new MethodDemo();
		md.m1();
	}
	
	public void m1(){
		System.out.println("m1");
		
		m2();
		
		m3();
	}
	
	public void m2(){
		System.out.println("m2");
	}
	
	public static void m3(){
		System.out.println("m3");
		
		MethodDemo d = new MethodDemo();
		d.m2();
	}
	
	public static void m4(){
		System.out.println("m4");
	}
}