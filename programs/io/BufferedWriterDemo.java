import java.io.*;

class BufferedWriterDemo {
	public static void main(String args[]) throws IOException{
		Writer w = new FileWriter("buff.txt");
		BufferedWriter bw = new BufferedWriter(w);
		
		bw.write("Server started successfully");
		bw.newLine();
		bw.write("Server restarting");
		bw.newLine();
		bw.write("Server restarting in 2 mins");
		bw.flush();
	
		bw.close(); //finally
		System.out.println(bw);
	}
}