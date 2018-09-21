class Basic {
	public int a = 30;
	public static int b = 45;
	
	public static void main(String[] args){
		System.out.println("hi");
		
		Basic object = new Basic();
		object.m1();
		
		Basic.m2();
		
		System.out.println(object.a);
		System.out.println(b);
	}
	
	public void m1(){

		System.out.println("m1 "+ a + " "+ b);
	}
	
	public static void m2(){

		Basic b1 = new Basic();
		System.out.println("m2 "+ b1.a + " "+ b);
	}
}