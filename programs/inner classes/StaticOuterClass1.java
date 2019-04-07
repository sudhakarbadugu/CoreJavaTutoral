class StaticOuterClass1 {
	private int salary =10000;
	static String name = "Murali";


	
	public void college(){
		System.out.println("StaticOuterClass1 Outer m1");
	}


	static class Students {
		
		public void m1() {
			StaticOuterClass1 o = new StaticOuterClass1();
			o.college();
			
			System.out.println("StaticOuterClass name: " + name);
		}
		
		public static void main(String[] args){

			Students lk = new Students();
			lk.m1();
			System.out.println("hello");
		}
	}

}