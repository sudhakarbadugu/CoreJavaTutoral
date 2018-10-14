class Overriding1{
  int money=10000;
   final void amount(){
   System.out.println("rent");
  }
}
class Over extends Overriding1{
	public static void main(String[] args){
	Overriding1 n=new Over();
	System.out.println(n.money);
	   n.amount();
	}
 protected final void amount(){
	 System.out.println("package");
 }
} 