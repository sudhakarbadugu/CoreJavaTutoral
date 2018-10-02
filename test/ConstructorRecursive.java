class ConstructorRecursive{
	private int age;
	public ConstructorRecursive(){
		System.out.println("a");
		age=a;
	}
	public ConstructorRecursive(int a){
		System.out.println("p");
	}
	ConstructorRecursive n=ConstructorRecursive();
	    n.m1();
		public void m1(){
			this();
			System.out.println(n);
		}
}