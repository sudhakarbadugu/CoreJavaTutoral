class Example{
     int a=30;
	 int b=20;
	 public static String name="hello";
	 public static void main(String...args){
		 Example xy=new Example();
			xy.h1();
			System.out.println(xy.a);
			System.out.println(xy.b);
			System.out.println(name);
	 }
	 public void h1(){
		System.out.println("h1 "+ a);
		System.out.println("h1 "+ b);
		System.out.println("h1 "+ name);
	 }
}