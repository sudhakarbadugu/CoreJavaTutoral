class MethodCallingPractise4{
	public static void main(String args[]){
	  System.out.println("MethodCallingPractise3");
	    MethodCallingPractise4 rank=new MethodCallingPractise4();
		              rank.m1();
	}
	public void m1(){
		System.out.println("m1");
		MethodCallingPractise4.m3();
	}
	public static void m3(){
	   System.out.println("m3");
	   MethodCallingPractise4.m2();
	}
	public static void m2(){
		System.out.println("m2");
		MethodCallingPractise4 abc=new MethodCallingPractise4();
		                 abc.m4();
	}
	public  void m4(){
	     System.out.println("m4");
	}
}