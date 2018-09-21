class MethodReturnTypeMath{
	public static void main(String args[]){
	    int g=MethodReturnTypeMath.add(76,75);
		System.out.println(g);
		double r=MethodReturnTypeMath.sub(65.7,7.8);
		System.out.println(r);
		long j=MethodReturnTypeMath.multiply(2888,108);
		System.out.println(j);
		double x=MethodReturnTypeMath.division(10f,0.5f);
		System.out.println(x);
		
		MethodReturnTypeMath ab = new MethodReturnTypeMath();
		// int a = ab.m1();//ce
	}
			
		public static int add(int a,int b){
			int c=a+b;
			return c;
		}
		public static double sub(double a,double b){
			double c=a-b;
			return c;
		}
		public static long multiply(long a,long b){
			long s=a*b;
			return s;
		}
		public static double division(float a,float b){
			double z=a/b;
			return z;
		}
		
		public void m1(){
			System.out.println("m1");
		}
		
	}
		// public static int getage(){
			// int n=22;
			// return n;
		// }
// 