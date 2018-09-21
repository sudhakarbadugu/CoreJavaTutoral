class InstanceMethodParamExample{
	public static void main(String args[]){
	System.out.println("InstanceMethodParamExample");
	     InstanceMethodParamExample hg=new InstanceMethodParamExample();
		 hg.add(10,3);
		 hg.sub(32,4.5f);
		 hg.mul(75,75.0);
		 hg.div(90,10);
		 hg.printName("murali",22);
	}
	public void add(int a,int b){
		System.out.println(a+b);
	}
	public void sub(int h,float g){
	    System.out.println(h-g);
    }
	public void mul(int f,double k){
		System.out.println(f*k);
	}
	public void div(int e,int w){
	System.out.println(e/w);
    } 
	public static void printName(String name,int age){
	System.out.println(name);
	System.out.println(age);
    }
}