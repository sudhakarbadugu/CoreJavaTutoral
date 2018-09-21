class StaticMethodParamExample1{
    public static void main(String args[]){
	int a=3;
	int b=6;
	 StaticMethodParamExample1 obj = new StaticMethodParamExample1();
	obj.add(a,b);
	obj.sub(10.5f,5);
	obj.mul(23.3,8);
	obj.printname("murali",22);
	}
	public void add(int a,int b){
  	}
	public void sub(float c,int d){
	System.out.println(c-d);
	}
	public void mul(double d,int e){
	System.out.println(d*e);
	}
	public void printname(String name,int age){
	System.out.println(name);
	System.out.println(age);
	}
	
}