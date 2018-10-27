abstract class waterPlants{
	public abstract void waterBranches();	
	public abstract void kenly();
	abstract void bisleri();
	}

 class purifier extends waterPlants{
	 public  void waterBranches(){
		System.out.println("sujala");
	} 
	public  void kenly(){
		System.out.println("minarals");
	}
	 void bisleri(){
		System.out.println("cool");
	}
}
class bottles{
	public static void main(String...q){
		waterPlants s=new purifier();
		s.waterBranches();
		s.kenly();
		s.bisleri();
		System.out.println(s);
	}
}