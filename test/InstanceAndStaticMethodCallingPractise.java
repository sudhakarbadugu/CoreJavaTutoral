class InstanceAndStaticMethodCallingPractise{
		public static int a = 10; 
	    public int b = 20;
		
		public static void main(String...a){
		InstanceAndStaticMethodCallingPractise e=new InstanceAndStaticMethodCallingPractise();
					e.m1();
		}
		public void m1(){
		   System.out.println("m1");
		InstanceAndStaticMethodCallingPractise.m2();
		}
        public static void m2(){
		System.out.println("m2");
		InstanceAndStaticMethodCallingPractise.m4();
		}
        public void m3(){
			System.out.println("m3");
			
		}
		public static void m4(){
			System.out.println("m4");
			InstanceAndStaticMethodCallingPractise j=new InstanceAndStaticMethodCallingPractise();
			j.m3();
		}	
}