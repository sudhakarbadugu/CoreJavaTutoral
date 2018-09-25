class StaticMethodCallingPractise{
	public static int a=10;
	public static void main(String...q){
		StaticMethodCallingPractise.m1();
	
	}
	public static void m1(){
		System.out.println("m1");
		System.out.println(a);
	}
	public static void m2(){
		System.out.println("M2");
		System.out.println(a);
	}
	public static void m3(){
		System.out.println("m3");
		System.out.println(a);
	}
	public static void m4(){
		System.out.println("m4");
	} 
}