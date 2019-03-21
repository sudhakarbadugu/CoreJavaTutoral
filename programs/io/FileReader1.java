import java.io.*;
class FileReader1{
		public static void main(String...q)throws IOException{
			File l=new File("business.txt");
			FileReader k=new FileReader(l);
			int length=(int)l.length();
			char[] content=new char[length];
			k.read(content);
			for(char a:content){
				System.out.println(a);
			}
		}
}