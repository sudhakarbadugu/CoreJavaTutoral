class Instanceof4{
	public static void main(String[] args){
		C c=new C();
		if(c instanceof A){
			System.out.println("hi");
		}
		c.k1();
		c.k2();
	}
}
class C{
	public void k1(){
		System.out.println("welcome to chennai");
	}
	
}
class A extends C{
	public void k2(){
		System.out.println("how is it");
	
	
}