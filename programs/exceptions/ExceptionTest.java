class ExceptionTest {
	public static void main(String... ar){
		int i = 10;
		int b = 0;

		try{
			int c = i/b;
			System.out.println("First");	
		} 
		catch(Exception e){
			System.out.println("error handled 1 " + e);
		}
		
		try{
			int c = i/1;
			System.out.println("Second");	
		} catch(Exception e){
			System.out.println("error handled 2" + e);
		}
		
		System.out.println("transfer to youth");	
	}
}