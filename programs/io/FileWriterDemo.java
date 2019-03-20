import java.io.*;

class FileWriterDemo {
	public static void main(String args[]) throws IOException{
		FileWriter fw = new FileWriter("server.log", true);
		
		fw.write("Server started successfully\n");
		fw.write("Server restarting\n");
		fw.write("Server restarting in 2 mins");
		//fw.write(65);
		
		fw.flush();
		
		FileWriter fw1 = new FileWriter("server.log", true);
		fw1.write("Server is down");		
		fw1.flush();	
		
		
		System.out.println(fw);
	}
}