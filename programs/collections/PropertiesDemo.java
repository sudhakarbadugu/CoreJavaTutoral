import java.util.*;
import java.io.*;

class PropertiesDemo{
    public static void main(String...q) {
		 String user = "Suda";
		 
		 //1. object create for propeties
		 Properties p = new Properties();
		 
		
		 
		try{
			//read the properties file
			Reader r = new FileReader("sample.properties");
		 
			//load reader to properties.
			p.load(r);
		}catch(IOException e){}
	
		 p.setProperty("lenovo", "70000");
		 System.out.println(p);
		 System.out.println(p.getProperty("lenovo", "6000"));
		 
		 String userFromProp = p.getProperty("username");
		 
		 if("Sudha".equals(userFromProp)){
			System.out.println("Successfully logged in");
		 }else {
			System.out.println("Failed to loggin");
		 }
	}
}
