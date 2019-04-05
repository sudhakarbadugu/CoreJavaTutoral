
class StaticOuterClass {
	private int age =5;
	static String name = "Sudhakar";


	
	public void outerM1(){
		System.out.println("StaticOuterClass Outer m1");
	}


	static class StaticInnerWheel {
		
		public void m1() {
			StaticOuterClass o = new StaticOuterClass();
			o.outerM1();
			
			System.out.println("StaticOuterClass name: " + name);
		}
		
		public static void main(String[] args){

			StaticInnerWheel siw = new StaticInnerWheel();
			siw.m1();
		}
	}

}