import java.io.*;
class Serilalization1{
	public static void main(String[] args){
		Mobile k=new Mobile("jio",200,"432Ap19");
		System.out.println(k.getName());
		System.out.println(k.getCost());
		System.out.println(k.getNumber());
		try{
			FileOutputStream f=new FileOutputStream("market.ser");
			ObjectOutputStream m=new ObjectOutputStream(f);
			m.writeObject(k);
			FileInputStream sa=new FileInputStream("market.ser");
			ObjectInputStream fl=new ObjectInputStream(sa);
			
			Object g=fl.readObject();
			Mobile p=(Mobile) g;
			System.out.println("after results");
			System.out.println(p.getName());
			System.out.println(p.getCost());
			System.out.println(p.getNumber());
		}catch(IOException a){
			System.out.println("mobile price:"+a);
		}
		catch(ClassNotFoundException  nfe){
			System.out.println(nfe);
		}
	}
}