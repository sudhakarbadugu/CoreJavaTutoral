import java.io.*;
class PrintWriterDemo{
	public static void main(String...a){
		PrintWriter pw = null;
		try{
			pw = new PrintWriter("E:\\Test\\abc.java");		
			
			pw.println("class Test {");
			pw.println("public void m1(){}");
			pw.println("}");

			pw.flush();
		}
		catch(IOException e){
			 System.out.println("exception" + e);
		}
		finally{
			if(pw != null){
				pw.close();
			}
			
		}
	}
}