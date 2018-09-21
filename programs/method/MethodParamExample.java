class MethodParamExample{
	
	public static void main(String[] args){
		int a = 15;
		int b = 20;
		MethodParamExample m = new MethodParamExample();

		m.add(a, b);
		m.sub(15, 20);
		m.sub(20, 15);
	}
	
	public void add(int a, int b){
		System.out.println(a + b);
	}
	
	public void sub(int c, int d){
		System.out.println(c - d);
	}
}
