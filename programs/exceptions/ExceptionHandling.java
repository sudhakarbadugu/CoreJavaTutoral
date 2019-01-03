class ExceptionHandling{
	public static void main(String...a){
	try{
	for(int i=0;i<=10;i++){
	System.out.println(10/i);
	}
	}
	catch(Exception s){
	System.out.println("vadtr");
	 s.printStackTrace();
	}
	System.out.println("a");
	}
}
