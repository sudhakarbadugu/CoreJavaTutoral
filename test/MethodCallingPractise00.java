class MethodCallingPractise00{
	public static void main(String...a){
		MethodCallingPractise00 g=new MethodCallingPractise00();
		g.m2();
	}
	
	public void m1(){
		MethodCallingPractise00.m4();
		System.out.println("m1");
	}
	
	public void m2(){
		MethodCallingPractise00.m3();
		System.out.println("m2");
	}
	
	public static void m3(){
		MethodCallingPractise00 n=new MethodCallingPractise00();
	    n.m1();
		System.out.println("m3");
	}
	
	public static void m4(){
		MethodCallingPractise00.m5();
		System.out.println("m4");
	}

	public static void m5(){
		System.out.println("m5");
	}	
}