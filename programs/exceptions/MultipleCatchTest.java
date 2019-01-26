class MultipleCatchTest{
	
	public static void main(String... ar) {
		try{
			String s = "10";
			int b = Integer.parseInt(s) /1;
		}
		catch(NumberFormatException nfe){
			System.out.println("Error" + nfe.getMessage());
		}
		catch(ArithmeticException are){
			System.out.println("Error" + ar.getMessage());
		}
		finally{
			System.out.println("Finally");
		}	//only finally
		
		System.out.println("multiple catches");
	}	
}