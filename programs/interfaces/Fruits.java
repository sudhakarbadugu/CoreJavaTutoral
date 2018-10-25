interface Fruits{
	public static final int apples=250;
	public static final int mangos=100;
	public abstract void totalApples();
	public abstract void totalMangos();
}
class numbers implements Fruits{
		public void totalApples(){
		 System.out.println("g");
	}
	 public void totalMangos(){
		 System.out.println("m");
	 }
 }
class vegetables{
 static int f;
   public static void main(String[] args){
     vegetables.f=22;
 System.out.println(Fruits.apples);
 System.out.println(Fruits.mangos);
 System.out.println(vegetables.f);
Fruits k=new numbers();
	k.totalApples();
	k.totalMangos();
   }
}