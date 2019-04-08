class StaticParentControl {
	static int a= 10;	//1 //10 value assign to 10
	
	static {	//2		//11
		m2();
		System.out.println("Parent First static block");	//10
	}
	
	public static void m2(){	//3		//12
		System.out.println("parent m2 method: a="+ a);	
	}
}

class StaticControlFlowDemo extends StaticParentControl {
	static int i= 10;	//4 //13 value assign to 10
	
	static {	//5		//14
		m1();
		System.out.println("First static block");	//16
	}
	
	public static void m1(){	//6	 //15	//21
		System.out.println("m1 method: i="+ i + " j="+ j);	
	}
	
	public static void main(String[] args){	//7		//20
		m1();
		System.out.println("main method");
	}
	
	static {		//8	//17
		System.out.println("Second static block"); //18
	}
	
	static int j = 20;		//9	//19 value assig to 20
}
