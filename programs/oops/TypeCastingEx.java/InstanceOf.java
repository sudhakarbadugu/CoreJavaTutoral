class InstanceOf{
	public static void main(String...k){
	A a=new C();
	a.r1();
	if(a instanceof C){
		System.out.println("welcome");
	}
	C c=(C)a;
	c.r2();
	}
}
class A{
  public void r1(){
	  System.out.println("variable");
  }
}
class C extends A{
	public void r2(){
		System.out.println("allow");
		
	}
	
}	