class InstanceAndStaticMethodReturnPractise{
	public static int a=10;
	public int b=20;
	public static void main(String[]args){	
	InstanceAndStaticMethodReturnPractise t=new InstanceAndStaticMethodReturnPractise();
	t.m1(10);
	InstanceAndStaticMethodReturnPractise.m2(1.6f);
	}
	public int m1(int c){
		c=a+b;
		System.out.println(a);
		System.out.println(b);
		return c;
	}
	public static float m2(float d){
		System.out.println("m2");
InstanceAndStaticMethodReturnPractise g=new InstanceAndStaticMethodReturnPractise();
	g.m3(g);
	
	return d;
	}
	public void m3(InstanceAndStaticMethodReturnPractise k){
		System.out.println("m3");
	
	}
	public static boolean m4(){
		System.out.println("m4");
		return true;
	}
}