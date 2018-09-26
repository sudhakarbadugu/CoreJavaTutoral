class InstanceAndStaticMethodReturnPractise {
	public int a=10;
	public static int b=20;
	
	public static void main(String...g){
	InstanceAndStaticMethodReturnPractise sr=new InstanceAndStaticMethodReturnPractise();
	int x=sr.m1(4);
	System.out.println(x);
	}
	
	public int m1(int c){ 
	 c=a+b;
	 System.out.println("m1");
	 System.out.println(a);
	 System.out.println(c);
	 InstanceAndStaticMethodReturnPractise.m2();
	 return b;
	}
	
	public static int m2(){
	InstanceAndStaticMethodReturnPractise.m4();
		System.out.println("m2");
		return b;
		
	}
	public int m3(){
		System.out.println("m3");
		return 0;
	}
	public static boolean m4(){
		InstanceAndStaticMethodReturnPractise m=new InstanceAndStaticMethodReturnPractise();
		m.m3();
	System.out.println("m4");
	return false;
	}
}