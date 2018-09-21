class MethodCallingPractise3{
	public static void main(String args[]){
	System.out.println("MethodCallingPractise3");
		MethodCallingPractise3.m1();
	}
	public static  void m1(){
		System.out.println("m1");
			MethodCallingPractise3 abc=new MethodCallingPractise3();
								 abc.m2();
	}
	public void m2(){
	    System.out.println("m2");
		MethodCallingPractise3.m3();
	}
	public static void m3(){
	    System.out.println("m3");
	     MethodCallingPractise3.m4();
	}
	public static void m4(){
      System.out.println("m4");
	}
}