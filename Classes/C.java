class A {
	int cash = 20;
	
	public int getCash(){
		return cash;
	}
}

//single inheritance
class B extends A{
	
	String property = "5 hecres";
}


class C extends B {
	public static void main(String args[]){
	
		A  object = new C();
		System.out.println(object.getCash());
		System.out.println(object.hashCode());
		
	}
	
	public void printMyPropery(){
		System.out.println("property:"+ property);
	}
}