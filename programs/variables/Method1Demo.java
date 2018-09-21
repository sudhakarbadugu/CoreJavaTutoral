class Method1Demo {
	
	private static void add(int a, int b){
		int z = a + b;
		System.out.println("Add:"+ z);
	}
	
	private static void m1(Method1Demo m){
		System.out.println(m);
	}
	
	public static void main(String args[]){
		System.out.println("main method");
		
		int a = 20, b = 40;
		int k = 40;
		int l = 50;
		
		Method1Demo m = new Method1Demo();
		add(l, k);
		m.add(20, 50);
		m.add(200, 0);
		m.add(a, b);
		
		m1(m);
	}
}