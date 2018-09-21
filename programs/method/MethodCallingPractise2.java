class MethodCallingPractise2{
	public static void main(String[]args){
	 System.out.println("MethodCallingPractise2");
	   MethodCallingPractise2 abc=new MethodCallingPractise2();
	   abc.m2();
	}
	public void m1(){
		System.out.println("m1");
		MethodCallingPractise2.m3();
	}
	public static void m2(){
		System.out.println("m2");
		MethodCallingPractise2 abc=new MethodCallingPractise2();
		abc.m1();
		
	}
	
	public static void m3(){
		System.out.println("m3");
		MethodCallingPractise2.m4();
	}
	
	public static void m4(){
		System.out.println("m4");
	}

}