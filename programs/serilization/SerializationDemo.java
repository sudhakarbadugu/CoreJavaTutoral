import java.io.*;

class SerializationDemo {
	
	public static void main(String args[]){
		Person p = new Person("Sudhakar", 29);
		System.out.println(p.getName());
		System.out.println(p.getAge());
		
		try{
			// convertig java object to file or network supportted format called serialization
			//Create an object for fileOutputstream
			FileOutputStream fos = new FileOutputStream("person.ser");

			//Create an object for ObjectOutputStream
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//Call the writeObject method of oos.
			oos.writeObject(p);
			
			//converting file or network supportted format to java object called deserialization
			
			// Crate an object for FileInputStream
			FileInputStream fis = new FileInputStream("person.ser");
			
			// Create an Object for ObjectInputStream
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//Get the object by calling readObject method.
			Object o = ois.readObject();
			
			Person p1 = (Person) o;
			
			System.out.println("After deserialization");
			System.out.println(p1.getName());
			System.out.println(p1.getAge());
			
			
		}catch(IOException ioe){
			System.out.println("Exception"+ ioe);
		}catch(ClassNotFoundException cle){
			System.out.println("Exception"+ cle);
		}
	}
	
}

