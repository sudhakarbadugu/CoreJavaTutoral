class Instanceof3{
	public static void main(String[] args){
		A a=new A();
		if(a instanceof C){
			System.out.println("d");
		}
		a.m1();
	}
}
class A{
	public void m1(){
		System.out.println("h");
	}
}