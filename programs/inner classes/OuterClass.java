
public class OuterClass {
	private int age =5;
	static String name = "Sudhakar";

	
	public static void main(String[] args){
		OuterClass oc = new OuterClass();
		OuterClass.Wheel ic = oc.new Wheel();
		
		OuterClass.Wheel ic1 = new OuterClass().new Wheel();
		
		ic.m1();
		ic1.m1();
	}
	
	public void outerM1(){
		System.out.println("Outer m1");
	}


	private class Wheel {
		
		public void m1() {
			outerM1();
			System.out.println("age: "+ age + " name: " + name);
		}
	}

}