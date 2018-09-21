class MethodCallingExp{
	int a=43;
	static int b=21;
	public static void main(String...ab){
	  System.out.println("methodcallingexp");
	  MethodCallingExp.m1(21);
	}
	public void m1(int c){
		c=a+b;
		System.out.println(a);
		System.out.println(b);
		return c;
	}
}