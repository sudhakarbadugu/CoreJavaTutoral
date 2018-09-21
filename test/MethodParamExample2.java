class MethodParamExample2{
    public static void main(String args[]){
	int r=10;
	int s=2;
	MethodParamExample2 m=new MethodParamExample2();
	m.add(r,s);
	m.sub(r,s);
	m.mul(12.5f,2);
	m.div(18.5,5.5f);
	m.printName("murali",22);
	}
	public void add(int r,int s){
		System.out.println(r+s);
	}
	public void sub(int r,int s){
		System.out.println(r-s);
	}
	public void mul(float t,int u){
		System.out.println(t*u);
	}
	public void div(double v,float w){
	    System.out.println(v/w);
	}
	public void printName(String name,int age){
			System.out.println(name);
			System.out.println(age);
}
}
