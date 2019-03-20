import java.io.*;

class FileReaderDemo {
	public static void main(String args[]) throws IOException{
		File f = new File("server.log");
		FileReader fr = new FileReader(f);
		
		int length = (int)f.length();
		char[] content = new char[length];
		fr.read(content);

		for(char c: content){
			System.out.print(c);
		}
	}
}