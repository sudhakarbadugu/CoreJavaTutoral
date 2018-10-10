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
	
		B object = new C();
		System.out.println(object.getCash());
		System.out.println(object.hashCode());
		
		//type cast
		// A obj1 = object;
		 C obj1 = (C)object;
		obj1.printMyPropery();
		
	}
	
	public void printMyPropery(){
		System.out.println("property:"+ property);
	}
}