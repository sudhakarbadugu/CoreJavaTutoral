class ExceptionThrowTest2{
	public static void main(String...a){
	String boyAge="murali";
	long number=81213939;
	ExceptionThrowTest2 obj=new ExceptionThrowTest2();
		obj.checkName(boyAge);
	try{
		//obj.checkAge(girlAge);
	}
	catch(RuntimeException f){
		System.out.println("msg");
		
	}
	
}
	void checkName(String name){
		if(name.equals("murali")){
			System.out.println(name);
		}
		else{
			throw new RuntimeException("marrige eligible");
		}
		
	}
}