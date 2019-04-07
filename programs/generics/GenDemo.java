//upto 1.4 version 
class GenDemo {

	public boolean add(Object o){
		return false;
	}
	
	public Object get(int index){
		return null;
	}
}

//upto 1.5 version 
class Gen1Demo<T> {

	private T o;
	Gen1Demo(T o){
		this.o = o;
	}
	
	public T get(){
		return o;
	}
	
	public boolean set(T o){
		this.o = o;
		return true;
	}
	
	public static void main(String args[]){
		Gen1Demo<Integer> g = new Gen1Demo<Integer>(10);
		g.set(20);
		
		Gen1Demo<String> g1 = new Gen1Demo<String>("Sudhakar");
		g1.set("Sudha");
		
		System.out.println(g.get());
		System.out.println(g1.get());
	}
}