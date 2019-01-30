class SportsException1{
	public static void main(String... d){
		int age=18;
		
		
		try{
			if(isSport(age)){
			System.out.println("eligible sports"+age);
		}
		
			int age2=50;
			if(isSport(age2)){
				System.out.println("not eligible guys"+age2);
			}
		}
		catch(SportsEligibleException se){
			System.out.println(se);
			
		}		
	}
	
	private static boolean isSport(int age) throws SportsEligibleException{
		if(age <= 18 && age >= 50){
			return true;
		}
		
		throw new SportsEligibleException("all playeres"+age);
	}

}
public class SportsEligibleException extends Exception{
	public SportsEligibleException(){
		
	}
	public SportsEligibleException(String reason){
		super (reason);
	}
}