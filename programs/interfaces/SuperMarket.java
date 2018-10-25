interface SuperMarket{
	public static final int material=500;
		public static final byte tomato=5;
		public static final String name="fog";
}
class market{
	// static int i;
	public static void main(String[] args){
	// market.i=67;
	System.out.println(SuperMarket.material);
	System.out.println(SuperMarket.tomato);
	System.out.println(SuperMarket.name);
	// System.out.println(market.i);
}
}