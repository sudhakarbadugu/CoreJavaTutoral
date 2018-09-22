//variable 
//method
// how to call method
// method parameter
//identifier -
class PojoExample {
	
	public static void main(String[] args){
		System.out.println("Main method");		
		m2("Sudha");
	}
	
	public void m1(int a, boolean b){
		System.out.println("m1 " + a);
		
		m3();		
		m4();
	}
	
	public static void m2(String c){
		System.out.println("m2 " + c);
		
		PojoExample p = new PojoExample();
		//int d = 20;
		p.m1(50, true);		
	}
	
	public void m3(){
		System.out.println("m3");
		
	}
	
	public static void m4(){
		System.out.println("m4");
	}
}