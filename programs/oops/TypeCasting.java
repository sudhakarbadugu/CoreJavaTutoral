class TypeCasting {
	public static void main(String[] args){
		int a = 1;
		byte b = (byte)a;
		
		System.out.println(a);
		
		TypeCasting c = new TypeCasting();
		
		A obj = new B();
		c.display(obj);
		
	}
	
	public void display(A a){
		System.out.println(a);
	}
}

class A {
}

class B extends A {
}

class C extends A {
	
}