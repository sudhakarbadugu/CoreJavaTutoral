class InstanceMethodParamExample{
	public static void main(String[] args){
   System.out.println("method");
   InstanceMethodParamExample g=new InstanceMethodParamExample();
					g.add(10,20);
					g.sub(2.4f,1.5f);
					g.mul(54,43);
					g.div(45,5.5f);
					g.rem(76,2.4);
					g.printName("murali",22);
	}
	public void add(int a,int b){
		System.out.println(a+b);
	}
	public void sub(float a,float b ){
		System.out.println(a-b);
	}
	public void mul(int a,int b){
		System.out.println(a*b);
	}
	public void div(double d,float f  ){
		System.out.println(d/f);
	}
	public void rem(int a,double d){
		System.out.println(a%d);
	}
	public static void  printName(String name,int age){
		System.out.println(name);
		System.out.println(age);
	}
}