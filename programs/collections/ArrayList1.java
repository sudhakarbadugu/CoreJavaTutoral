import java.util.*; 
  public class ArrayList1 {
	
	public static void main(String[] args){
	List l = new ArrayList();
		l.add(42);
		l.add(32);
		System.out.println(l);
		l.add(0,23);
		System.out.println(l);
		l.add("suresh");
		System.out.println(l);
		System.out.println(l.get(3));
		System.out.println();
		l.set(0,32);
		System.out.println(l);
		List r=new ArrayList();
		r.addAll(l);
		r.addAll(3,l);
		System.out.println(l);
		l.add(73);
		System.out.println(l.contains(73));
		System.out.println(l.indexOf("75"));
		l.remove(1);
		System.out.println(l);
		l.clear();
		System.out.println(l);
	 }
}
