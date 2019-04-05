
public class MethodOuterClass {
	private int age =5;
	static String name = "Sudhakar";

	
	public static void main(String[] args){
		MethodOuterClass oc = new MethodOuterClass();
		
		oc.outerM1();
	}
	
	public void outerM1(){
		class MethodWheel {
			public void m1() {
				System.out.println("Method inner class op: age: "+ age + " name: " + name);
			}
		}
		
		MethodWheel mw = new MethodWheel();
		mw.m1();
		
		System.out.println("Outer m1");
		
	}
}