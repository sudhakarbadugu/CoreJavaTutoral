import java.io.*;

class BufferedReaderDemo {
	public static void main(String args[]){
		BufferedReader br = null;
		try{
			Reader r = new FileReader("buff.txt");
			br = new BufferedReader(r);
		
			String line = br.readLine();
			while(line != null ){
				System.out.println(line);
				line = br.readLine();
			}
			
			//Char by char
			// int c =  br.read();
			// while(c >= 0 ){
				// System.out.println((char)c);
				// c = br.read();
			// }
			
		}
		catch(FileNotFoundException f){
			System.out.println("Error occurred");
		}
		catch( IOException ioe){
			System.out.println("Error occurred" + ioe);
		}
		finally {
			if(br != null){
				try{
					br.close(); //finally
				}catch(IOException e){
					
				}
			}
			
		}
		
		
		System.out.println("Close");
	}
}