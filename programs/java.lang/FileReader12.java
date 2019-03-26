import java.io.*; 
class FileReader12 { 
public static void main(String args[]) {
try{	
FileReader fr = new FileReader("file.java"); 
BufferedReader br = new BufferedReader(fr); 
String s; 
while((s = br.readLine()) != null) { 
System.out.println(s); 
} 
}catch(Exception e){
	System.out.println("hai this is java file");
} 
} 
}