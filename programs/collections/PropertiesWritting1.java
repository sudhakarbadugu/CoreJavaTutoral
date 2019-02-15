import java.util.*;
import java.io.*;
class PropertiesWritting1{
	public static void main(String[] args){
		String user="murali";
		Properties l=new Properties();
		try{
		Reader r=new FileReader("sample1.properties");
		
		l.load(r);
		}
		catch(Exception e){
			
		}
		System.out.println(l);
		System.out.println(l.getProperty("murali","10000"));
		l.setProperty("prasad","90876");
		String Prog =l.getProperty("username");
		if("suresh".equals(Prog)){
			System.out.println("login page");
		}else{ 
		System.out.println("failed page");
		try{
		Writer rt=new FileWriter("sample1.properties");
		l.store(rt,"store value");
		}
		catch(Exception e){}
					 
		 try{
		 Writer w = new FileWriter("sample.properties");
		 p.store(w, "store lenovo value");
		 }
		 catch(Exception e){}
		 
		 
		 
		 
		 
		 
		}
}
}
}
