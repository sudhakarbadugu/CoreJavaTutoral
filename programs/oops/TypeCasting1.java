class TypeCasting1{
    public static void main(String[] args){
		A a=new B();
		a.m1();
		B b=(B)a;
		b.m2();
		 C c=new C();
		 c.m3();
		// C c=(C)b;
		// c.m3();
		 
		// if(c instanceof C){
			// C c=new c();
			// c.m3();
		}
	}
	
	class A{
		public void  m1(){
		System.out.println("m1");
	}
	}
	class B extends A{
		public void m2(){
		System.out.println("m2");
	}
	}
	class C extends A{
		public void m3(){
		System.out.println("m3");
	}
}
	