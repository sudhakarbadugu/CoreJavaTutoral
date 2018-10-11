class Parent {
	int cash = 200000;
	
	void marry(){
		System.out.println("marry subbalaxi");
	}
	
}

class Child extends Parent{

	public static void main(String args[]){
		Parent c = new Child();
		System.out.println(c.cash);
		c.marry();		
	}
		
	protected void marry(){
		System.out.println("I want to maryy Tamanna");
	}	
}