class ConstructorOverloading{
	private int age;
	public ConstructorOverloading(){
			System.out.println("l");
		}
	public ConstructorOverloading(int i){
		int age=i;
		System.out.println("p");
	}	
	ConstructorOverloading kt=new ConstructorOverloading(){
				kt.m1();
	
	public int m1(){
		System.out.println("b");
	}
}
}