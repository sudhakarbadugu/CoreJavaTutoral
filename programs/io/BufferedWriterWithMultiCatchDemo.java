import java.io.*;

class BufferedWriterWithMultiCatchDemo {
	public static void main(String args[]){
		try(Reader r = new FileReader("buff.txt");
			BufferedReader br = new BufferedReader(r)){
		
			String line = br.readLine();
			while(line != null ){
				System.out.println(line);
				line = br.readLine();
			}			
		}
		catch(IOException | NullPointerException f){
			System.out.println("Error occurred");
		}
		
		System.out.println("Close");
	}
}