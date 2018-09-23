class MethodReturnTypeDemo {
	
	public static void main(String... args){
		MethodReturnTypeDemo m = MethodReturnTypeDemo.getObject();
		
		//MethodReturnTypeDemo mr = new MethodReturnTypeDemo();
		m.add(10, 50);
		
		int c = m.sub(10, 50);
		System.out.println( c);
		
		boolean d = m.equal(10, 50);
		System.out.println( d);
		
		String s = m.getName();
		System.out.println(s);
		
		float f = m.mul(10);
		System.out.println( f);
		
		m.mul(20);

	}
	
	public void add(int a, int b){
		System.out.println(a+b);
	}
	
	public int sub(int a, int b){
		int c = a -b;
		return c;
	}
		
	public boolean equal(int a, int b){
		boolean c = a == b;
		return c;
	}
	
	public float mul(int a){
		float f = a * 10;
		return f;
	}
	
	
	public String getName(){		
		return "Sudhkar";
	}
	
	public static MethodReturnTypeDemo getObject(){
		MethodReturnTypeDemo m = new MethodReturnTypeDemo();		return m;
	}
	
}