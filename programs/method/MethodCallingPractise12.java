class MethodCallingPractise12{
	public static void main(String...a){
	   System.out.println("MethodCallingPractise12");
	   MethodCallingPractise12 ab=new MethodCallingPractise12();
					ab.m1();
	}
	public void m1(){
		System.out.println("m1");
		m2();
	}
	public static void m2(){
		System.out.println("m2");
		MethodCallingPractise12.m4();
	}
	public static void m3(){
		System.out.println("m3");
	}
	public static void m4(){
		System.out.println("m4");
		MethodCallingPractise12.m3();
	}
}