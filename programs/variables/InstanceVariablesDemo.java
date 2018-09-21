class InstanceVariablesDemo {
	public int rollNo = 10;
	public static String college = "SV arts";

	public static void main(String[] args){
		InstanceVariablesDemo iv = new InstanceVariablesDemo();
		System.out.println(iv.rollNo);
		
		System.out.println(college);
		
		iv.m1();
	}
	
	public void m1(){
		System.out.println("m1 " + rollNo);
		System.out.println("m1 " + college);
	}
}