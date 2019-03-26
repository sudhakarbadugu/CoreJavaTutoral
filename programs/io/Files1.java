import java.io.*;
class Files1{
	public static void main(String...a){
	try{	
	File n=new File("test1.txt");
	boolean ab=n.exists();
	System.out.println(ab);
	boolean create=n.createNewFile();
	System.out.println("createNewFile:"+create);
	
	 File folder=new File("test1");
	 boolean folderCreate=folder.mkdir();
	System.out.println("folderCreate:"+folderCreate);
	System.out.println(folder.isDirectory());
	        // boolean f=getName.delete();
		    // System.out.println(f.getName()+"dlt"+f);
		   File file=new File("test1","window");
		   boolean folder1Create=file.createNewFile();
		   System.out.println(folder1Create);
		   System.out.println(n.isFile());
		   String[] fileName=folder.list();
			 for(String s:fileName){
				 System.out.println(s);
			 }
		 
		   }
		   catch(IOException c){
			   System.out.println("haiii heloo");
		   }
	}
}
		   
		   
		
