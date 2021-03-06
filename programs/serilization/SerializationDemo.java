import java.io.*;

class SerializationDemo {
	
	public static void main(String args[]){
		Person p = new Person("Sudhakar", 29, 50000);
		p.address1 = "karuru1";
		
		Mobile m = new Mobile();
		m.phoneNumber = 94919191;
		
		Telephone t = new Telephone();
		t.telephoneNumber = 91213939;
		m.tele = t;
		
		p.phone = m;
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.salary);
		System.out.println(p.address);
		System.out.println(p.address1);
		System.out.println(p.phone.phoneNumber);
		
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
			System.out.println(p1.salary);			
			System.out.println(p1.address);
			System.out.println(p1.address1);
			
		System.out.println(p.phone.phoneNumber);
		}catch(IOException ioe){
			ioe.printStackTrace();
			System.out.println("Exception: "+ ioe);
		}catch(ClassNotFoundException cle){
			cle.printStackTrace();
			System.out.println("Exception: "+ cle);
		}
	}
}

