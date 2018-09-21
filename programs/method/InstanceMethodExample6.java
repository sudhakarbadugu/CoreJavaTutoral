class InstanceMethodExample6{
	public static void main(String[]args){
	InstanceMethodExample6 obj=new InstanceMethodExample6();
		obj.add(54,90);
		obj.sub(90.5f,50);
		obj.printname();
		obj.age();
		obj.salary();
	}
	public void add(int a,int b){
		System.out.println(a+b);
	}
	public void sub(float n,int r){
		System.out.println(n-r);
	} 
	public void printname(){
		System.out.println("murali");
	}
	public void age(){
		System.out.println(22);
	}
	public void salary(){
		System.out.println(20000);
	}
}
	