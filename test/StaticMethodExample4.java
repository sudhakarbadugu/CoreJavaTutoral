class StaticMethodExample4{
      public static void main(String args[]){
	  System.out.println("StaticMethodExample4");
	  StaticMethodExample4.add();
	  StaticMethodExample4.subtraction();
	  StaticMethodExample4.multiplication();

	  StaticMethodExample4.reminder();
	  }
	  public static void add(){
		  System.out.println("add");
		  int a=8;
		  byte b=4;
		  System.out.println(a+b);
	  }
	  public static void subtraction(){
		  System.out.println("subtraction");
		  int d=56;
		  float e=12.5f;
		  System.out.println(d-e);
	  }
	  public static void multiplication(){
		  System.out.println("multiplication");
		int g=60;
		double h=3.2;
		System.out.println(g*h);
	  }
	  public static void division(){
	  System.out.println("division");
	  int f=65;
	  byte g=5;
	  System.out.println(f/g);
	  }
	  public static void reminder(){
		  System.out.println("reminder");
		     byte a=100;
			 int b=50;
			 System.out.println(a%b);
		  
	  }
	  }

