class StaticMethodParamExample{
	public static void main(String[] args){
		int d=19;
		int e=20;
	StaticMethodParamExample.add(d,e);
	StaticMethodParamExample.sub(8,30.5f);
    StaticMethodParamExample.mul(d,e);	
	}
	public static void add(int a,int b){
		System.out.println(a+b);
	}
		public static void sub(double d,float g){
			System.out.println(d-g);
		}
	public static void mul(int d,int e){
		System.out.println(d*e);
	}	
}