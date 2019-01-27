class UserDefinedExceptionTest {
	public static void main(String... ar){
		int age = 25;
		
		if(isElible(age)){
			System.out.println("transfer to youth " + age);	
		}
		
		try{
			int age1 = 20;
			if(isElible(age1)){
				System.out.println("transfer to youth "+ age1);	
			}
		}catch(UserValidationException uve){
			System.out.println(uve);
		}
	

		int age2 = 30;
		if(isElible(age2)){
			System.out.println("transfer to youth "+ age2);	
		}

		
		System.out.println("For all transferred");	
	}
	
	private static boolean isElible(int age){
		if(age >= 22 && age <= 35){
			return true;
		}
		
		throw new UserValidationException("He is not eligle by age "+ age);
	}	
}