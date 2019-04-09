class AutoBoxingDemo {

	static public void main(String... ar){
		int a = 20;
		m1(a);
		
		Integer i = 30;
		int b = i;
		
		// Integer I1 = new Integer(10);
		// Integer I2 = new Integer(10);
		// System.out.println(I1 == I2);

		
		Integer I1 = 128;
		Integer I2 = 128;
		System.out.println(I1 == I2);	//false

	}
	
	public static void m1(Integer i){
		System.out.println(i);
	}
}
