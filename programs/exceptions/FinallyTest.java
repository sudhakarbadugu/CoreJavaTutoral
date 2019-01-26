import java.io.*;

class FinallyTest {
	int i = 10;
	public static void main(String... ar) {
		System.out.println("register");
		try{
			// FinallyTest s = new FinallyTest();			
			FinallyTest s = null;			
			System.out.println(s.i);
			
		}catch(NullPointerException e){
			System.out.println(e);	
		}
		finally {
			System.out.println("transfer");
		}
	}	
}