interface Machines{
	public static final int tv=5;
	public static final String name="samsung";
	public static final int rate=10000;
	public abstract void tvCost();
	 public abstract void name();
	public abstract void amount();
}
class sales implements Machines{
	public void tvCost(){
	System.out.println("amount");	
	}
	public void name(){
	System.out.println("samsung");	
	}
	public void amount(){
	System.out.println("rate");	
	}
}
class rent{
	public static void main(String...a){
		System.out.println(Machines.tv);
		System.out.println(Machines.name);
		System.out.println(Machines.rate);
		Machines p=new sales();
		p.tvCost();
		p.name();
		p.amount();
	}
}