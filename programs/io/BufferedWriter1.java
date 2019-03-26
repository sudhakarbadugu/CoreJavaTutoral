import java.io.*;
class BufferedWriter1{
		public static void main(String...a){
			try{
			Writer g=new FileWriter("ab.txt");
		BufferedWriter k=new BufferedWriter(g);
		k.write("hi this is java program");
		k.newLine();
		k.write("election commision");
		k.newLine();
		k.flush();
		k.close();
		System.out.println(k);
			}
}
 catch(IOException e){
	 System.out.println("exception");
 }
}