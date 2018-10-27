abstract class abstractshirts{
   int s=32;
   public abstract void cost();
   void m2(){
	   System.out.println("m2");
   }	
}
class lenin extends abstractshirts{
	public void cost(){
		int a=10;
		byte b=7;
		int c=a+b;
		System.out.println(c);
		System.out.println("j");
	}
}
class shirtsDemo{
	public static void main(String...g){
	abstractshirts m=new lenin();
	m.cost();
	System.out.println(m);
}
}