class InstanceParentControl {
	int a= 10;	//1 //10 value assign to 10
	
	{	//2		//11
		m2();
		System.out.println("Parent First instance block");	//10
	}
	
	InstanceParentControl(){
		System.out.println("Parent constructor");
	}
	
	public void m2(){	//3		//12
		System.out.println("parent m2 method: a="+ a);	
	}
}

class InstanceControlFlowDemo extends InstanceParentControl{
	int i= 10;	//1 //7 i=10
	
	{	//2
		m1();
		System.out.println("First instance block");	
	}
	
	InstanceControlFlowDemo(int j){	//3
		this.j = j;
		System.out.println("Constructor i=" + i +" j:"+j);
	}
	
	public void m1(){	//4
		System.out.println("m1 method: i="+ i + " j="+ j);	
	}
	
	public static void main(String[] args){
		InstanceControlFlowDemo ie = new InstanceControlFlowDemo(30); 
		ie.m1();
		
		System.out.println("Second object flow");
		InstanceControlFlowDemo ie1 = new InstanceControlFlowDemo(40); 
		ie1.m1();
		
		System.out.println("main method");
	}
	
	{ //5
		System.out.println("Second instance block"); 
	}
	
	int j = 20;	//6
}
