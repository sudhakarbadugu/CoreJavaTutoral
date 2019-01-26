class CatchOrderTest{
	
	public static void main(String... ar) {
		try{
			String s = "10";
			int b = Integer.parseInt(s) /1;
		}
		catch(Exception nfe){
			System.out.println("Error in exception catch");
		}
		catch(Throwable are){
			System.out.println("Error in run catch");
		}
		finally{
			System.out.println("Finally");
		}	//only finally
		
		System.out.println("catches order");
	}	
}