class Parent {
	int cash = 200000;
	
	void marry(){
		System.out.println("marry subbalaxi");
	}
	
}


class Child2 extends Parent {

}


class Child extends Parent{

	public static void main(String args[]){
		Parent c = new Child();
		System.out.println(c.cash);
		c.marry();
		
		Parent p = new Child2();
		System.out.println(p.cash);
		p.marry();
		
		p = new Child();
		System.out.println(p.cash);
		p.marry();
				
		int a = 20;
		System.out.println(a);
		
		a = a + 5;
		a = a + 15;
		System.out.println(a);
	}
		
	protected void marry(){
		System.out.println("I want to maryy Tamanna");
	}	
}
