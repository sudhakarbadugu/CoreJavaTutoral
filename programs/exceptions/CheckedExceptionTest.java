import java.io.*;

class CheckedExceptionTest {
	public static void main(String... ar){

	
		try{			
			System.out.println("hello");
			String file = null;
			if(file == null){
				throw new FileNotFoundException("File is not available");
				// throw new RuntimeException("File is not available");
			}
		}
		catch(IOException e){
			System.out.println(e);
		}
	}

	
	
}