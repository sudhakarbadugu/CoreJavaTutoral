import java.util.*;

class BoundedTypesDemo1<T extends Runnable> {

	private T o;	
	public T get(){
		return o;
	}
	
	public boolean set(T o){
		this.o = o;
		return true;
	}
	
	public void display(ArrayList<String> l){	//generic version
		l.add("Sudha");
		
		System.out.println(l);
	}
	
	public static void main(String args[]){
		BoundedTypesDemo1<Thread> g = new BoundedTypesDemo1<Thread>();
		Thread t = new Thread();
		g.set(t);
		
		ArrayList l = new ArrayList();	//normal version
		l.add("Sudhakar");
		l.add(20);
		
		g.display(l);
		
		System.out.println(g.get().getName());
	}
}