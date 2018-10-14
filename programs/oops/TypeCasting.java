class TypeCasting {
	public static void main(String[] args){
		TypeCasting t = new TypeCasting();
		
		A a = new B();
		a.m1();
		
		B b = (B) a;
		// B b = (A) a;
		
		b.m2();
		
		A a1 = new C();
		
		//a1 = null;
		if(a1 instanceof C){
			C c = (C) a1;
			
			a1.m1();
			c.m3(); //ce	
		}
		
		A a3 = new A();
		a3.m1();
		
		//D d = (D) a;
		//D d = (D) a;
		
		if(a instanceof A){
			System.out.println("C is type of A");
		}		
		
		A a5 = new A();
		if(a5 instanceof C){
			System.out.println("a5 is type of A");
		}else{
			System.out.println("a5 not type of A");
		}
	}
}

class D {

}

class A {
	public void m1(){
		System.out.println("m1");
	}
}

class B extends A {
	public void m2(){
		System.out.println("m2");
	}
}

class C extends A {
	public void m3(){
		System.out.println("m3");
	}
}