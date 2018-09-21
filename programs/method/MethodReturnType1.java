class MethodReturnType1{
	public static void main(String[]args){
	int result=MethodReturnType1.add(10,29,35);
		System.out.println(result);
	float b=MethodReturnType1.sub(3.1f,2.1f,1.1f);
		System.out.println(b);
	long c=MethodReturnType1.mul(12,21,23);
		System.out.println(c);
	}
	public static int add(int a,int b,int c){
		int d=a+b-c;
		return d;
}
     public static float sub(float a,float b,float c){
		 float f=a-b-c;
		 return f;
	 }
	 public static long mul(int a,int b,int c){
		 long g=a*b*c;
		 return g;
	 }
}

