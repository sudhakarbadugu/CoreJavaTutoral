abstract class whatsApp{
	public abstract void Stringname();
	abstract void age();
	abstract void otherApps();
	void  salary(){
		System.out.println(" sundar pichei");
	}
}
class director extends whatsApp{
	public void Stringname(){
		System.out.println("sundarpechei");
	}
	public void age(){
		System.out.println("43");
	}
	public void salary(){
		System.out.println(" 1cr");
	}
	public void otherApps(){
		System.out.println("yahoo");
	}
}
class propeties{
	public static void main(String args[]){
		whatsApp b=new director();
		b.Stringname();
		b.age();
		b.salary();
		b.otherApps();
		System.out.println(b);
	}
}
