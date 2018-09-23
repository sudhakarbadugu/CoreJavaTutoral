class StaticMethodParamExample0{
	public static void main(String args[]){
		StaticMethodParamExample0.add(75,87);
		sub(16.5f,7.5f);
		mul(65,5.5f);
		div(90,5);
		PrintName("murali",22);
	}
	
	public static void add(int a,int b){
	System.out.println( a+b);
	}
	public static void sub(float a,float b){
	System.out.println(a-b);
	}
	public static void mul(int c,float d){
	System.out.println(c*d);
	}
	public static void div(double s,int a){
	System.out.println(s/a);
	}
	public static void PrintName(String name,int age){
	System.out.println(name);
	System.out.println(age);
	}
	
}