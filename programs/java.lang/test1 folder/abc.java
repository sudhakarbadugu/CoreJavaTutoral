import java.io.*;
class Abc{
	public static void main(String...a){
		try{
		File s=new File("work");
		boolean y=s.exists();
		System.out.println("file available:"+y);
		boolean create=s.createNewFile();
		System.out.println("create:"+create);
	// String names="Abc.txt,ab.txt,servere.txt,server2.txt,servers.txt,abs.txt,badugus.txt";
		// boolean startsWith=names.startsWith("s");
			// System.out.println(startsWith);
			// boolean endsWith=names.endsWith("txt");
			// System.out.println(endsWith);
			// int compare=names.compareTo("server2");
			// System.out.println(compare);
			// boolean contains=names.contains("a");
			// System.out.println(contains);
			// File k=new File("test.txt");
			// System.out.println(k);
			
			 File folder = new File("test3");
		 boolean folderCreate = folder.mkdir();
		 System.out.println("folder created: " + folderCreate);
		 File file=new File("test","abc.txt");
		 boolean fileCreate=file.createNewFile();
		 System.out.println("fileCreate:"+fileCreate);
		 String[] fileNames = folder.list();
		 for(String fileName : fileNames){
		  System.out.println(fileName);
			
			 if(fileName.startsWith("A")){
				System.out.println("A - " + fileName);
			 }
			
			 if(fileName.endsWith("S")){
				 System.out.println("S - " + fileName);
			 }
			
			 if(fileName.startsWith("A") && fileName.endsWith("S")){
				System.out.println("Starts with A - endsWith S" + fileName);
			 }
			
			 if(fileName.contains("server")){
				 System.out.println("contains s - " + fileName);
			 }
		}
		
			
	 }
catch(IOException e){
	System.out.println("hello java file");
}
}
}