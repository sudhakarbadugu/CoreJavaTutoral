class InstanceAndStaticMethodCallingPractise{
	static int a=10;
	int b=20;
	public static void main(String[]args){
		InstanceAndStaticMethodCallingPractise mce=new InstanceAndStaticMethodCallingPractise();
		int d=mce.m1(10);
		System.out.println(d);
		m2(2.5f);
	}
	public int m1(int c){
		c= a+b;
		System.out.println(a);
		System.out.println(b);
		return c;
	}
	public static void m2(float c){
		System.out.println(a);
		System.out.println(c);
		InstanceAndStaticMethodCallingPractise s=new InstanceAndStaticMethodCallingPractise();
		s.m3(s);		
		System.out.println(s.b);
		// InstanceAndStaticMethodCallingPractise.m3(new InstanceAndStaticMethodCallingPractise());
	}
	
	public void m3(InstanceAndStaticMethodCallingPractise f){
			System.out.println("m3");
			m4();
	}
	public static void m4(){
		System.out.println("m4");
	} 
}
