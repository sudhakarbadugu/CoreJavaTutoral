class MethodReturnTypeMath1{
    public static void main(String...s){
		MethodReturnTypeMath1 m=new MethodReturnTypeMath1();
		m.add(5,9);
		double d=m.sub(76.0,47.9);
		System.out.println(d);
		double y =m.division(4.5f,2f);
		System.out.println(y);
		long l=m.mul (4,5);
		System.out.println(l);
	}
	public int add(int a,int b){
		int s=a-b;
		return s;
	}
	public double sub(double a,double b){
		double d=a-b;
		return d;
	}
	public long mul(int a,int b){
		long l=a*b;
		return l;
	}
	public double division(float a,float b){
		double y=a/b;
		return y;
	}
	public void m1(){
		System.out.println("m1");
	}
}
