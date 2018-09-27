class InstanceAndStaticMethodCallingPractise5{
		public static int a=20;
		public  int b=10;
		
	public static void main(String...k){
		System.out.println("InstanceAndStaticMethodCallingPractise");
		InstanceAndStaticMethodCallingPractise5 vm=new InstanceAndStaticMethodCallingPractise5(); 
		vm.m1();
	}
    public void m1(){
		System.out.println(b);
		System.out.println(a);
		InstanceAndStaticMethodCallingPractise5.m2();
	}
	public static void m2(){
		System.out.println("m2");
		InstanceAndStaticMethodCallingPractise5.m4();
	}
	public void m3(){
		System.out.println("m3");
	}
	public static void m4(){
		System.out.println("m4");
		InstanceAndStaticMethodCallingPractise5 ab=new InstanceAndStaticMethodCallingPractise5();
		ab.m3();
	}
}