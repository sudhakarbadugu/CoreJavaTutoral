class MethodCalling19{
	public static void main(String...args){
	system.out.println("MethodCalling19");
	MethodCalling19.m1();
	}
	public void m1(){
	 System.out.println("m1");
	 MethodCalling19 xy=new MethodCalling19();
				xy.m2();
	}
	public static void m2(){
	System.out.println("m2");
	MethodCalling19.m4();
	}
	public void m3(){
	System.out.println("m3");
	
	}
	public static void m4();
	System.out.println("m4");
	MethodCalling19 mn=new MethodCalling19();
	        mn.m3();
}