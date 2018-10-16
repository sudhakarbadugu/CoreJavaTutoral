class TypeCasting2{
   public static void main(String...f){
      A a=new B();
	  a.s1();
	  B b=(B)a;
	  b.s2();
	  
	   if( b instanceof C){
		   System.out.println("wru");
		   C c=(C)b;
			c.s3();
	   }
		
	  }
   }
class A{
public void s1(){
	System.out.println("hai");
}
}
class B extends A{
public void s2(){
	System.out.println("hru");
}
}
class C extends B{
	public void s3(){
		System.out.println("wru");
	}
}