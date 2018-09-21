class AddMethodExample {
	public static void main(String[] args){
		System.out.println("adding");
		int a = 5, b = 10;
		// System.out.println(a+b);
		
		int c = 20, d = 30;
		// System.out.println(c + d);
		
		int e = 50, f = 30;
		// System.out.println(e + f);
		
		int x = 50, y = 380;
		// System.out.println(x + y);
		
		AddMethodExample addMethod = new AddMethodExample();
		addMethod.add(a, b);
		addMethod.add(c, d);
		addMethod.add(e, f);
		addMethod.add(x, y);
		addMethod.add(23, 45);
		addMethod.add(50, 100);
		
		addMethod.swap(a, b);
		addMethod.swap(x, y);
		addMethod.swap(e, f);
		
		// System.out.println("before swap a value:" + a);
		// System.out.println("before swap b value:" + b);
		// c = a + b;
		// a = c-a;
		// b = c-b;
		
		// System.out.println("a value:" + a);
		// System.out.println("b value:" + b);
		
		// System.out.println("before swap x value:" + x);
		// System.out.println("before swap y value:" + y);
		// c = x + y;
		// x = c-x;
		// y = c-y;
		
		// System.out.println("x value:" + x);
		// System.out.println("y value:" + y);
	}


	public void add(int a, int b){
		System.out.println(a + b);
	}
	
	public void swap(int a, int b){
		System.out.println("before swap a value:" + a);
		System.out.println("before swap b value:" + b);
		int c = a + b;
		a = c-a;
		b = c-b;
		
		System.out.println("a value:" + a);
		System.out.println("b value:" + b);
	}	
}