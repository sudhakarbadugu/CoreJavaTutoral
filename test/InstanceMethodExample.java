class InstanceMethodExample{
     public static void main(String args[]){
	 System.out.println("InstanceMethodExample");
	 InstanceMethodExample object=new InstanceMethodExample();
	 object.add();
	 object.Sub();
	 object.Multiply();
	 object.Division();
	 }
	 public void add(){
	 System.out.println("add");
	 int a=4;
	 int b=3;
	 System.out.println(a+b);
	 } 
	 public void Sub(){
	 System.out.println("sub");
	 int a=23;
	 int b=12;
	 System.out.println(a-b);
	 }
	 public void Multiply(){
	 System.out.println("multiply");
	 int s=3;
	 int g=4;
	 System.out.println(s*g);
	 }
	 public void Division(){
		 System.out.println("division");
		 int r=18;
		 int t=9;
		 System.out.println(r/t);
	 }
	 }

