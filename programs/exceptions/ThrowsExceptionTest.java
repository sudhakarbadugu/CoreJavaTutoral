import java.io.*;

class ThrowsExceptionTest {
	public static void main(String... ar) {
		try{
			m2();
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
		
		System.out.println("transfer");
	}

	static void m2() throws FileNotFoundException{
		System.out.println("m2");
		m1();
	}
	static void m1() throws FileNotFoundException{
		System.out.println("m1");
		String file = null;
		if(file == null){
			throw new FileNotFoundException("File is not available");
		}
	}
	
	
}