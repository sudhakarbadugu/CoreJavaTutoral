class InstanceAndStaticMethodParamCallingPractise{
	static int a=10;
	int b=20;
	
	public static void main(String args[]){
		InstanceAndStaticMethodParamCallingPractise ab=new InstanceAndStaticMethodParamCallingPractise();
		int e=ab.m1(10);
		System.out.println(e);
		InstanceAndStaticMethodParamCallingPractise.f2(5.7f);
	}
	public int m1(int c){
		c=a+b;
		System.out.println(a);
		System.out.println(b); 
		return c;
	}
	public static void f2(float f){
	 System.out.println(a);
	System.out.println(b);
	InstanceAndStaticMethodParamCallingPractise b=new InstanceAndStaticMethodParamCallingPractise();
	b.m3(b);
	}
	public void m3(InstanceAndStaticMethodParamCallingPractise f){
		System.out.println("m3");
		m4();
	}
	public static void m4(){
		System.out.println("m4");
	}
}
