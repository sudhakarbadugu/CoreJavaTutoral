class MethodReturnTypeMath4{
	public static void main(String args[]){
	int t=MethodReturnTypeMath4.add(50,50);
	System.out.println(t);
	float d=MethodReturnTypeMath4.sub(90f,50f);
	System.out.println(d);
	String a=MethodReturnTypeMath4.getname();
	System.out.println(a);
	int l=MethodReturnTypeMath4.getage();
	System.out.println(l);
	double r=MethodReturnTypeMath4.multiply(2,1.5f,4);
	System.out.println(r);
	long j=MethodReturnTypeMath4.getsalary();
	System.out.println(j);
	long v=MethodReturnTypeMath4.division(625,25);
	System.out.println(v);
	}
	public static int add(int a,int b){
		int c=a+b;
		return  c;
		
	}
	public static float sub(float f,float h ){
		float g=f-h;
		return g;
	}
	public static String  getname(){
		return "murali";
	}
	public static int getage(){
		int o=22;
		return o;
	}
	public static double multiply(int y,float z,int s){
	    	double n=y*z*s;
			return n;
	}
	public static long getsalary(){
		long g=50000;
		return g;
	} 
	public static long division(int i,int f){
		long j=i/f;
		return j;
		
	}
}

	
