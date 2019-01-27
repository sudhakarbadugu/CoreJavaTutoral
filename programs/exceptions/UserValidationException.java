public class UserValidationException extends RuntimeException{

	public UserValidationException(){
	}
	
	public UserValidationException(String reason){
		super(reason);//we are calling super class constructor.	
	}	
}