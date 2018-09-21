class MethodCallingPractise13{
	int  a=45;
  static int b=45;	
	public static void main(String...a){
		System.out.println("MethodCallingPractise12");
		MethodCallingPractise13 object=new MethodCallingPractise13();
		object.s1();
		MethodCallingPractise13.s2(45);
		MethodCallingPractise13.s4();
	}
	public void s1(){
		System.out.println(a);
		System.out.println(b);
		System.out.println("s1");
	}
	 public static void s2(int c){
	     c=a+b;
		System.out.println(c);
	    System.out.println("s2");
	    MethodCallingPractise13 sb=new MethodCallingPractise13();
					 sb.s3();
	 }
	public void s3(){
		System.out.println("s3");
	}
    public static void s4(){
		System.out.println("s4");
	}
}