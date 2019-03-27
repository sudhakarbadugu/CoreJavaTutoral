import java.io.*;

class CustomSerializationDemo {
	
	public static void main(String args[]){
		Order o = new Order();
		
		BuyOrder bo = new BuyOrder();
		bo.orderNo = 1;
		
		o.buy = bo;
		
		System.out.println(o.buy.orderNo);
					
		try{
			// convertig java object to file or network supportted format called serialization
			//Create an object for fileOutputstream
			FileOutputStream fos = new FileOutputStream("order.ser");

			//Create an object for ObjectOutputStream
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//Call the writeObject method of oos.
			oos.writeObject(o);
			
			//converting file or network supportted format to java object called deserialization
			
			// Crate an object for FileInputStream
			FileInputStream fis = new FileInputStream("order.ser");
			
			// Create an Object for ObjectInputStream
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//Get the object by calling readObject method.
			Object obj = ois.readObject();
			
			Order p1 = (Order) obj;
			
			System.out.println("After deserialization");
			System.out.println(p1.buy.orderNo);
			
		}catch(IOException ioe){
			ioe.printStackTrace();
			System.out.println("Exception: "+ ioe);
		}catch(ClassNotFoundException cle){
			cle.printStackTrace();
			System.out.println("Exception: "+ cle);
		}
	}
}

