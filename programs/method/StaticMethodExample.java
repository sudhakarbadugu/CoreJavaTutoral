class StaticMethodExample{
	public static void main(String args[]){
		System.out.println("StaticMethodExample");
		
		StaticMethodExample.add();
		StaticMethodExample.sub();
	}
	
	public static void add(){
		byte b = 127;
		short c = 2500;
		
		System.out.println(b + c);
	}
	
	public static void sub(){
		byte b = 20;
		int c = 33;
		System.out.println(c - b);
	}
}