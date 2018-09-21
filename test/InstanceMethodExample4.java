class InstanceMethodExample4{
	public static void main(String args[]){
		System.out.println("InstanceMethodExample");
		InstanceMethodExample4 Object1=new InstanceMethodExample4();
		Object1.addition();
		Object1.multiplication();
		Object1.division();
		Object1.subtraction();
	}
	public void addition(){
		System.out.println("addition");
			int a=39;
			int b=9;
			System.out.println(a+b);
		
	}
     public void multiplication(){
		 System.out.println("multiplication");
		 int a=65;
		 int b=65;
		 System.out.println(a*b);
		 
	 }
	 public void division(){
		 System.out.println("division");
		 int a=56;
		 int c=8;
		 System.out.println(a/c);
	 }
	    public void subtraction(){
	      System.out.println("subtraction");
	        int c=24;
	        int d=12;
	        System.out.println(c-d);
}
	 
}