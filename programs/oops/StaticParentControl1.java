class StatiControlFlow{
	static int j=43;
	static {
		System.out.println("a block");
	}
	public void s2(){
		s2();
		System.out.println("s2 method:j="+j);
	}
}

class StaticParentControl1 extends StatiControlFlow{
		static int a=65;
		
		static {
		System.out.println("first static block");
		s1();
		}
		
		public static void s1(){
			System.out.println("s1 method:a="+a +  b="+b);
		}
		
		public static void main(String[] args){ 
		System.out.println("main method" );
		s1();
		}
		static {
		System.out.println("second static block");
		}
		
		static int b=23;
}
