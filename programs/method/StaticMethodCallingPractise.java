class StaticMethodCallingPractise{
	public static int a = 10;
	public static void main(String[]args){
		m1();
	}
	public static void m1(){
		System.out.println("m1");

		m2();
		System.out.println(a);
	}
	public static void m2(){
		StaticMethodCallingPractise.m4();
		System.out.println(a);
		System.out.println("m2");
	}
	public static void m3(){
		System.out.println(a);
		System.out.println("m3");
	}
	public static void m4(){
		m3();
		System.out.println(a);
		System.out.println("m4");
	}
}
