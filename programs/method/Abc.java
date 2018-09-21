class Abc{
	public static void main(String args[]){
		System.out.println("hello");
		Abc object=new Abc();
		object.addittion();
		
		Abc.m2();
		Abc.m3();
	}
	
	public void addittion(){
		System.out.println("addittion method");
		int a = 10;
		int b = 30;
		System.out.println(a+b);
	}
	
	public void substraction(){
		
	}	
	
	public static void m2(){
		System.out.println("m2 static method");
	}

	public static void m3(){
		System.out.println("m3 static method");
	}
}

