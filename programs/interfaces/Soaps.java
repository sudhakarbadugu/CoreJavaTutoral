interface Soaps{
	public static final String name="lux";
	public abstract void santoor();
}
class purchase implements Soaps{
	public void santoor(){
	System.out.println("lerial");
}
}
class payment{
	public static void main(String...a){
		System.out.println(Soaps.name);
		Soaps s=new purchase();
		s.santoor();
	}
}

