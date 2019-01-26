class TryWithFinally{
	
	public static void main(String... ar) {
		try{
			String s = "10";
			int b = Integer.parseInt(s) /1;
		}
		finally{
			System.out.println("Finally");
		}	//only finally
		
		System.out.println("Only with finally block");
	}	
}