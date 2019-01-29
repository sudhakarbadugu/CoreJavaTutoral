class sportsException{
	public static void main(String... d){
		int age=18;
		if(isSport(age)){
			System.out.println("eligible sports"+age);
		}
		
		try{
			int age2=50;
			if(isSport(age2)){
				System.out.println("not eligible guys"+a2);
			}
		}
		catch(sportsException se){
			System.out.println(se);
			
		}		
	}
	
	private static boolean isSport(int age){
		if(age <= 18 && age >= 50){
			return true;
		}
		
		throw new sportsException("all playeres"+age);
	}

}