class InstanceMethodCallingPractise{
	public int a=10;
	
	public static void main(String args[]){
		InstanceMethodCallingPractise ab=new InstanceMethodCallingPractise();
		ab.m1();
	}
	public void m1(){
		System.out.println("m1");
		System.out.println(a);		 
		m2();
	}	
	 public void m2(){
		System.out.println("m2");
		System.out.println(a);
		m4();
	 }
	 public void m3(){
		 System.out.println("m3");
	 }
	 
	public void m4(){
		System.out.println("m4");
		System.out.println(a);
		m3();
	}
}