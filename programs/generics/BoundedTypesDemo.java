class BoundedTypesDemo<T extends Number> {

	private T o;	
	public T get(){
		return o;
	}
	
	public boolean set(T o){
		this.o = o;
		return true;
	}
	
	public static void main(String args[]){
		BoundedTypesDemo<Integer> g = new BoundedTypesDemo<Integer>();
		g.set(20);
		
		BoundedTypesDemo<Byte> g1 = new BoundedTypesDemo<Byte>();
		byte b = 10;
		g1.set(b);
		
		// BoundedTypesDemo<String> g1 = new BoundedTypesDemo<String>();
		// g1.set("Sudha");
		
		System.out.println(g.get());
		System.out.println(g1.get());
	}
}