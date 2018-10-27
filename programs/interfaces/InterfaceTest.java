interface A {
	void m1();
	
}

interface B {
	void m1();
}

class C implements A, B {
	public void m1(){
		System.out.println("c m1");
	}
}

class InterfaceTest {
	public static void main(String[] b){
		A a = new C();
		a.m1();
		
		B b = new C();
		b.m1();
		
		C c = new C();
		c.m1();
		
	}
}