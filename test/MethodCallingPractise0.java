class MethodCallingPractise0{
    public static void main(String args[]){
	MethodCallingPractise0.m3();
	}
	public void m1(){
		System.out.println("m1");
		MethodCallingPractise0.m4();
	}
	
	public void m2(){
		System.out.println("m2");
		m1();
	}
	
	public static void m3(){
		System.out.println("m3");
	MethodCallingPractise0 f=new MethodCallingPractise0();
	     f.m2();
	}
	
	public static void m4(){
		System.out.println("m4");
		MethodCallingPractise0.m5();
	}
	
	public static void m5(){
		System.out.println("m5");
	}
}