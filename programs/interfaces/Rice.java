interface Rice{
	public static final int rawRiceRate=800;
    public  String riceName="basamati";
}
class Amman{
	static int b;
	public static void main(String[] args){
	 Amman.b=52;
		System.out.println(Rice.rawRiceRate);
		System.out.println(Rice.riceName);
		 System.out.println(Amman.b);
	}
}