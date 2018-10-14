class Overriding{
      int salary=10000;

		 void heroine(){
			System.out.println("anupama");
		}
}
class Prasad extends Overriding{
	
	public static void main(String args[]){
		Overriding s=new Prasad();
		System.out.println(s.salary);
		s.heroine();
	}
	protected void heroine(){
		System.out.println("kajal");
	}
}

