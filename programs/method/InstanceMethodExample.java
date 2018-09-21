class InstanceMethodExample{
	public static void main(String args[]){
		System.out.println("InstanceMethodExample");
		InstanceMethodExample object2=new InstanceMethodExample();
		object2.addition();
		object2.m3();
		object2.m4();
		object2.m5();
	}
	public void addition(){
	System.out.println("adding");
	int a=10;
	int b=20;
	System.out.println(a+b);
}
	public void m3(){
		
		System.out.println("subtraction");
		int a=34;
		int b=10;
		System.out.println(a-b);
	}
	public void m4(){
		System.out.println("division");
		int a=6;
		int b=7;
		System.out.println(a/b);
	}
	public void m5(){
		System.out.println("percentage");
		int a=10;
		int b=2;
		System.out.println(a%b);
	}
	}
