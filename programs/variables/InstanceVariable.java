class InstanceVariable{
	int a=10;
	int b=20;
	public static String name="raju";
	public static void main(String...args){
		InstanceVariable ab=new InstanceVariable();
			ab.add();
				System.out.println(ab.a);
				System.out.println(ab.b);
				System.out.println(name);
	}
	public void add(){
	  System.out.println(a);
	  System.out.println(b);
	  System.out.println(name);
	}
}