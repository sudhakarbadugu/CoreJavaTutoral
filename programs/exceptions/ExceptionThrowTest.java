class ExceptionThrowTest {
	public static void main(String... ar){
		int p1Age= 20;
		int p2Age= 17;
		
		ExceptionThrowTest e = new ExceptionThrowTest();
		e.checkAge(p1Age);
		
		try{			
			e.checkAge(p2Age);
		}
		catch(RuntimeException e1){
			System.out.println("Error:"+e1.getMessage());
		}
	}
	
	void checkAge(int age){
		if(age >= 18 ) {
		System.out.println(age);
		}else {
			throw new RuntimeException("Lessthan 18 is not allowed");
			// throw new ExceptionThrowTest();	//CE
			// System.out.println("exception raised");	//CE
			
		}		
	}
}