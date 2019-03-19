import java.io.*;


class FileDemo {
	public static void main(String args[]) throws IOException{
		
		File f = new File("test.txt");
	
		boolean isFileExist = f.exists();
		System.out.println("File available: " + isFileExist);
		
		boolean create = f.createNewFile();
		System.out.println("File created: " + create);
		
		File folder = new File("test");
		boolean folderCreate = folder.mkdir();
		System.out.println("folder created: " + folderCreate);
		
		File file = new File("test", "abc.txt");
		boolean fileCreate = file.createNewFile();
		System.out.println("file created: " + fileCreate);
		
		System.out.println(folder.isDirectory());
		System.out.println(f.isFile());
		
		System.out.println("Iterating file names");
		//iterate over file NAMES
		String[] fileNames = folder.list();
		for(String fileName : fileNames){
			System.out.println(fileName);
		}
		
		System.out.println("Iterating files");
		//iterate over files
		File[] files = folder.listFiles();
		int count = 0, directoryCount = 0;
		for(File folderFile : files){
			System.out.println(folderFile.getName() + " - "+ folderFile.isDirectory() + " parent:"+ folderFile.getParent());
			
			if(folderFile.isFile()){
				count++;
			}
			
			
			if(folderFile.isDirectory()){
				directoryCount++;
			}
		}
		
		boolean d = f.delete();
		System.out.println(f.getName() + " Delete file:"+ d);
		
		System.out.println(count);
		System.out.println(directoryCount);
	}
}