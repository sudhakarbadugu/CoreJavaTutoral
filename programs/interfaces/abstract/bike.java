abstract class bike{
	 // int  p=1;
	public abstract void run();
	void honda(){
	System.out.println("bike slow");
	} 
}
class fz extends bike{
	public void run(){
	System.out.println("fast driving");
}
}
class parking{
	public static void main(String...c){
		bike b=new fz();
		b.run();
		System.out.println(b);
	}
}
