class OverloadingExample {
	
	public void m1(int a, String b){
		System.out.println(" int string");
	}
	
	public void m1(String a, int b){
	System.out.println(" string int");
	}
	
	public int m2(int a, String b){
		return 1;
	}
	
	public static void main(String[] args){
		OverloadingExample a = new OverloadingExample();
		a.m1("A", 10);
	}
}

