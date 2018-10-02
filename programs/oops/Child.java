class Child extends Parent {

	public static void main(String... args){
		Child c = new Child();
		System.out.println(c.property);
		System.out.println(c.cash);
		System.out.println(c.toString());
	}
}