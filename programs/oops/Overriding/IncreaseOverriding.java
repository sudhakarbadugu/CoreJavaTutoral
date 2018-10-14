class p{
	void m1(){
	System.out.println("red");	
	}
class q extends p{	
	
	private void m2(){
		System.out.println("blue");
	}
}

public static void main(String...s){
	p a=new q();
	System.out.println("as");
}
}