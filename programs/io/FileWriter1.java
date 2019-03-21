import java.io.*;

class FileWriter1{
	public static void main(String...a)throws IOException{
		FileWriter g=new FileWriter("business.txt",true);
		System.out.println(g);
		g.write("welcome market rates\n");
		g.write("payment transaction\n");
		g.write("your transaction successfully");
		g.flush();
	
	  FileWriter k=new FileWriter("business.txt",true);
	 k.write("server buzy");
	 k.flush();
	 System.out.println(g);
}
}