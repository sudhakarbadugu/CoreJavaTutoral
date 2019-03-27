import java.io.*;

class Order implements Serializable{
	transient BuyOrder buy;

	private void writeObject(ObjectOutputStream os)throws Exception {
		System.out.println("custom writeObject");
		os.writeInt(buy.orderNo);
	}
	
	private void readObject(ObjectInputStream is)throws Exception {
		System.out.println("custom readObject");
		
		is.defaultReadObject();
		
		BuyOrder b = new BuyOrder();
		int orderNo = is.readInt();
		b.orderNo = orderNo;
		
		this.buy = b;
	}	
}

class BuyOrder {
	int orderNo;
}