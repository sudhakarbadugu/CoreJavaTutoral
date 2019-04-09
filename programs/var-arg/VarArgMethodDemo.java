class VarArgMethodDemo {

	static public void main(String... ar){
		m1("Sudha");
		m1("Suma", 10, 20, 40, 60);
	}
	
	public static void m1(String name, int... values){
		System.out.println(values.length);
		int total = 0;
		for(int i: values){
			total += i;
			// System.out.println(i);
		}
		
		System.out.println("name: "+ name + " total: "+ total);
	}
}
