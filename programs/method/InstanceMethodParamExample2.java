class InstanceMethodParamExample2{
	public static void main(String args[]){
		int a=43;
		int b=34;
		InstanceMethodParamExample2 m1=new InstanceMethodParamExample2();
		m1.add(a, b);
		m1.sub(10, 20);
		m1.sub(a, b);
	}

	public void add(int a,int b){
		System.out.println(a+b);
	}

	public void sub(int c,int d){
		System.out.println(c-d);
	}
}
