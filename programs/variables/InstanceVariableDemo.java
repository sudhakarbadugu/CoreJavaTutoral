class InstanceVariableDemo {
		int intrestRate = 24;
		int days = 30;
		
	public static void main(String... args){
		InstanceVariableDemo id = new InstanceVariableDemo();
		int year = 5;
		
		id.m1(year);
		id.m2();
	}
	
	private void m1(int year){
		int amount = 50000;
		int total = amount * intrestRate *days *year/100;
		System.out.println("m1:" + total);
	}
	
	private void m2(){
		int amount = 20000;
		int total = amount * intrestRate * days/100;
		System.out.println("m2: " + total);
	}
}
