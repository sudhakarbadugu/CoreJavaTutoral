class StaticMethodParamExample4{
    public static void main(String args[]){
		int a=18;
		int b=4;
		byte e=5;
		StaticMethodParamExample4.add(a,b);
		StaticMethodParamExample4.sub(b,e);
		StaticMethodParamExample4.multiply(e, b);
		StaticMethodParamExample4.printname("Sudhakar",a);
	}
	
	public static void add(int a,int b){
		System.out.println(a+b);
	}

	public static void sub(int c,byte d){
		System.out.println(c-d);
	}

	public static void multiply(byte e,int f){
			System.out.println(e*f);
	}

	public static void printname(String name,int age){
		System.out.println(name + " " + age);
	}
}
