class OverloaindExample2{
   public void s1( int i,double j){
   System.out.println("a");
   }
	public void s1(double i,int j){
	System.out.println("s2");
	}
	public static void main(String...a){
	OverloaindExample2 h=new OverloaindExample2();
	h.s1(32,77.7);
}
}