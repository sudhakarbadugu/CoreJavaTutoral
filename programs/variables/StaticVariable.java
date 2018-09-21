class StaticVariable{
     public int no=1;
	 public static String name="venky";
	 public static void main(String[] args){
		StaticVariable.m2(int no); 
		StaticVariable.m2("venky");
	 }
	 public static void m2(){
		System.out.println("m2"+ no);
		System.out.println("m2"+ name);
	 }
}