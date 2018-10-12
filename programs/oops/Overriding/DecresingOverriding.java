class p{
	public void m1(){
	System.out.println("m1");
	}
class c extends p{
	void m2(){
		System.out.println("m2");
	}
}
	public static void main(String args[]){
		p obj=new c();
		System.out.println();
	}	
	}
